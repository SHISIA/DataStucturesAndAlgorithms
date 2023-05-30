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
}
