package org.datastructures.code;

public class DoubleEndedQueueImplLinkedList<E> extends StackImplLinkedList<E> implements DoubleEndedQueue<E>{
    protected DoublyLinkedList<E> list = (DoublyLinkedList<E>) getNewLinkedList();

    @Override
    protected LinkedList<E> getNewLinkedList(){
        return new DoublyLinkedList<>();
    }

    @Override
    public E eject() {
        if(list.getLength() == 0)
        return null;
        E value = (E) list.getLast();
        list.removeLast();
        return value;
    }

    @Override
    public void inject(E value) {
        list.appendLast(value);
    }

    @Override
    public E peekLast() {
        if(list.getLength() == 0)
        return null;
        return (E) list.getLast();
    }
    
    
}
