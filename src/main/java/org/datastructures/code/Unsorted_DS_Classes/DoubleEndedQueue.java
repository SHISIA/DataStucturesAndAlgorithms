package org.datastructures.code.Unsorted_DS_Classes;

public interface DoubleEndedQueue<E> extends Stack<E>{
    void inject(E value);
    E eject();
    E peekLast();
}
