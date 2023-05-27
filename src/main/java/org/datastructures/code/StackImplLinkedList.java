package org.datastructures.code;

public class StackImplLinkedList<E> implements Stack<E> {
    protected LinkedList<E> list=getNewLinkedList();

    @Override
    public void push(E value) {
       list.appendFirst(value);
    }

    private LinkedList<E> getNewLinkedList() {
        return new LinkedList<>();
    }

    @Override
    public E pop() {
       if(list.getLength() == 0 ){
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
