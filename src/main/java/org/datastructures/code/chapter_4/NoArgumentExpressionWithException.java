package org.datastructures.code.chapter_4;

@FunctionalInterface
public interface NoArgumentExpressionWithException<R> {
    R evaluate() throws Exception;
}
