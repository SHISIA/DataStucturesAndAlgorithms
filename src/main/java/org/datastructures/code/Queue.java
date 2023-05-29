package org.datastructures.code;

public interface Queue<E>{
    void enqueue(E value);
    E dequeue();
    E peek();
}
