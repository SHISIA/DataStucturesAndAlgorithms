package org.datastructures.code;

public class QueueImplArray<E> implements Queue<E> {

    protected E[] array;
    protected int start = 0;
    protected int end = 0;
    protected int lenghth = 0;

    public QueueImplArray(int size){
        array=(E[]) new Object[size];
    }

    @Override
    public void enqueue(E value) {
        if(lenghth>=array.length){
            throw new NoSpaceException("No more space to add an element");
        }
        array[end]=value;
//         The modulo operator will make sure that the index goes to the beginning of the array
// when it hits the end of the array, as follows:
        end = (end+1) % array.length;
        lenghth ++;
    }

//     The dequeue operation does not change the end position. We read from the start
// index and then increment the start index with rollover, as follows:
    @Override
    public E dequeue() {
        if(lenghth<=0){
            return null;
        }
        E value =array[start];
        start = (start+1) % array.length;
        lenghth --;
        return value;
    }

    @Override
    public E peek() {
        if(lenghth<=0){
            return null;
        }
        return array[start];
    }
    
}
