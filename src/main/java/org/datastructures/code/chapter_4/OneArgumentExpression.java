package org.datastructures.code.chapter_4;

@FunctionalInterface
public interface OneArgumentExpression<E, R> {
    R compute(E head);

}
