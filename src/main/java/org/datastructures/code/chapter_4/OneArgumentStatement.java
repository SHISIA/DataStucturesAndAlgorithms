package org.datastructures.code.chapter_4;

//The forEach method for a linked list
@FunctionalInterface
public interface OneArgumentStatement<E> {
    void doSomething(E argument);
}
