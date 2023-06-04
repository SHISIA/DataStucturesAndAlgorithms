package org.datastructures.code.chapter_4;

@FunctionalInterface
public interface OneArgumentExpression<E, P> {
    P compute(E head);

}
