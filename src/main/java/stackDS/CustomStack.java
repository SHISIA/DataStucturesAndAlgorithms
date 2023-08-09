package stackDS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomStack<T> {
    private static final int DEFAULT_SIZE=10;

    private T[] data;
    private int pointer=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=(T[]) new Object[size];
    }

    public boolean add(T element) throws StackException {
        if (isFull()) throw new StackException("Cannot add element ");
        pointer++;
        data[pointer]=element;
        return true;
    }

    private boolean isFull() {
        return pointer == data.length - 1;
    }

    private boolean isEmpty(){
        return pointer == -1;
    }

    private boolean push(T element) throws StackException {
        return add(element);
    }

    public T peek(){
        if (isEmpty()) return null;
        return data[pointer];
    }

    public T pop(){
        if (isEmpty()) return null;
        return data[pointer--];
    }

    public int search(T element){
        if (isEmpty()) return -1;
        for (int i=0;i<data.length;i++){
            if (data[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
}
