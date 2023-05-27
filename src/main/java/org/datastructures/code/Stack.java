package org.datastructures.code;

/**
 *Since we know that ADTs(Abstract Data Types) are to data structures what interfaces are to classes, we
will code an ADT as an interface. The following is our interface for a stack: 
 **/
public interface Stack<E> {
    void push(E value);
    E pop();
    E peek();
}
