package org.datastructures.code.Unsorted_DS_Classes;

public class DoubleendedQueueImplArray<E> extends QueueImplArray<E> implements DoubleEndedQueue<E>{

    public DoubleendedQueueImplArray(int size) {
        super(size);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void push(E value) {
      if(lenghth >= array.length){
            throw new NoSpaceException("No space to add an element");
      }
      start = (start + array.length - 1) % array.length;
      array[start] = value;
      lenghth ++;
    }

    @Override
    public E pop() {
       return dequeue();
    }

    @Override
    public void inject(E value) {
        enqueue(value);
    }

    @Override
    public E eject() {
        if(lenghth==0){
            return null;
        }
        end =(end + array.length - 1) % array.length;
        E value = array[end];
        lenghth --;
        return value;

    }

    @Override
    public E peekLast() {
        if(lenghth == 0){
            return null;
        }
        return array[(end + array.length -1) % array.length];
    }
    
}
