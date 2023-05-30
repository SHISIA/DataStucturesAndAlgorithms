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
}