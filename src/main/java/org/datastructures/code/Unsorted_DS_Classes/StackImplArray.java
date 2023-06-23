package org.datastructures.code.Unsorted_DS_Classes;

public class StackImplArray<E> implements Stack<E> {
    protected E[] array;
    int top= -1;

    public StackImplArray(int size){
        array = (E[]) new Object[size];
    }

// We first check whether the stack is already full or the current top is equal to the
// maximum index possible, like this:
    @Override
    public void push(E value) {
        if(top == array.length-1){
            throw new NoSpaceException("No more space in stack");
        }
        top++;
        array[top] = value;
    }

    @Override
    public E pop() {
       if(top==-1){
            return null;
       }
    //    Then we update the top and return the value at the current top as follows:
       top --;
       return array[top+1];
    }

    @Override
    public E peek() {
       if(top==-1){
            return null;
       }
    //    Otherwise, we return the top element, as follows:
       return array[top];
    }
    
}
