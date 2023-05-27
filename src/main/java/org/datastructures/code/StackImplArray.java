package org.datastructures.code;

public class StackImplArray<E> implements Stack<E> {
    protected E[] array;
    int top= -1;

    public StackImplArray(int size){
        array = (E[]) new Object[size];
    }

    @Override
    public void push(E value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }
    
}
