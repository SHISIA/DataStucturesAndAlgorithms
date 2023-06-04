package org.datastructures.code.chapter_4;

/**
 *Fold operation on a list 
 **/
@FunctionalInterface
public interface TwoArgumentExpression<A,B,R> {
    R compute(A lhs,B rhs);
}
