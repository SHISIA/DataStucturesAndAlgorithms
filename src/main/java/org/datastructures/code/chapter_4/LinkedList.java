package org.datastructures.code.chapter_4;

public class LinkedList <E> {
    private E head;
    private LinkedList<E> tail;

    private LinkedList(){

    }

    private LinkedList(E head, LinkedList<E> tail){
        this.head = head;
        this.tail = tail;
    }

    public E head(){
        return head;
    }

    public LinkedList<E> tail(){
        return tail;
    }

//     Note that every time we add a
// new value to our linked list, we create a new linked list so that the old references still
// hold references to the unmodified list:
    public LinkedList<E> add(E value){
        return new LinkedList<E>(value,this);
    }

    public static final class EmptyList<E> extends LinkedList<E> {
        @Override
        public E head(){
            throw new NoValueException("head() invoked on empty list");
        }
    
        @Override
        public LinkedList<E> tail(){
            throw new NoValueException(" tail() invoked on an empty list");
        }

        @Override
        public void forEach(OneArgumentStatement<E> processor){

        }

        @Override
        public <R> LinkedList<R> map(OneArgumentExpression<E,R> transformer){
            return LinkedList.emptyList();
        }

        @Override
        public <R> R foldLeft(R initialValue,TwoArgumentExpression<R,E,R> computer){
            return initialValue;
        }

        @Override
        public <R> R foldRight(TwoArgumentExpression<E,R,R> computer,R initialValue){
            return initialValue;
        }

//         The EmptyList of course needs to override this method
// to just return itself because all we need is an empty list. Now, we can do the following:
        @Override
        public LinkedList<E> filter(OneArgumentExpression<E,Boolean> selector){
            return this;
        }
    


    }

    public void forEach(OneArgumentStatement<E> processor){
        processor.doSomething(head());
        tail().forEach(processor);

    }

    public <P> LinkedList<P> map(OneArgumentExpression<E,P> transformer){
        return new LinkedList<>(transformer.compute(head()),
        tail().map(transformer));
    }

    public static <E> LinkedList<E> emptyList(){
        return new EmptyList<>();
    }

    //foldLeft
    //foldLeft operation aggregates the head first and moves on to the tail. 
    public <R> R foldLeft(R initialValue,TwoArgumentExpression<R,E,R> computer){
        R newInitialValue = computer.compute(initialValue, head());
        return tail().foldLeft(newInitialValue, computer);
    }
    
    //foldRight:
    //foldRight operation aggregates the tail first and moves on to the head.
    public <R> R foldRight(TwoArgumentExpression<E,R,R> computer,R initialValue){
        R computedValue = tail().foldRight(computer, initialValue);
        return computer.compute(head,computedValue);
    }

    // Filter operation for a linked list
    //we create a helper method that appends a range of numbers to the head of an
    //existing list. This method can call itself recursively:
    public static LinkedList<Integer> ofRange(int start, int end, LinkedList<Integer> tailList){
        if(start >= end){
            return tailList;
        }else{
            return ofRange(start+1, end, tailList).add(start);
        }
    }
    
    // Then we use the helper method to generate a list of a range of numbers:
    public static LinkedList<Integer> ofRange(int start, int end){
        return ofRange(start, end,LinkedList.emptyList());
    }

    // We now want to create a list of all even numbers, say. For that, we create a
    // filter method in the class
//     The filter() method checks whether the the condition is met. If yes, then it includes
// the head and calls the filter() method on the tail. If not, then it just calls the
// filter() method on the tail.
    public LinkedList<E> filter(OneArgumentExpression<E,Boolean> selector){
        if(selector.compute(head())){
            return new LinkedList<E>(head(), tail()).filter(selector);
        }else{
            return tail().filter(selector);
        }
    }

    //example
//     Given an integer, n, and a string, we want
// the resultant string to be a repetition of the original string n number of times.
// For example, given an integer 5 and a string Hello, we want the output to be
// HelloHello HelloHello Hello
    public static String repeatString2(final String seed, int count){
        return LinkedList.ofRange(1, count+1)
            .foldLeft("",(a,b)->a+" "+seed);
    }

    public static void main(String[] args) {
        System.out.println(repeatString2("Shisia", 5));
    }

}
