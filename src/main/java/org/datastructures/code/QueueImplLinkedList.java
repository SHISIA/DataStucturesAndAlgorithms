package org.datastructures.code;

public class QueueImplLinkedList<E> implements Queue<E> {
    protected LinkedList<E> list=getNewLinkedList();

    @Override
    public void enqueue(E value) {
       list.appendLast(value);
    }

    private LinkedList<E> getNewLinkedList() {
        return new LinkedList<>();
    }

    @Override
    public E dequeue() {
        if(list.getLength()==0){
            return null;
        }
        E value = (E) list.getFirst();
        list.removeFirst();
        return value;
    }

    @Override
    public E peek() {
       if(list.getLength() == 0){
            return null;
       }
       return (E) list.getFirst();
    }
    
}
