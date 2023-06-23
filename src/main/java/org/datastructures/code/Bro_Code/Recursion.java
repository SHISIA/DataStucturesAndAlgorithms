package org.datastructures.code.Bro_Code;

import jdk.jfr.Unsigned;

/**RECURSION:
 * a method that calls itself. Can substitute iteration.
 * Usage: Advanced sorting algorithms and navigating trees
 * ADVANTAGES:
 * Easier to read/write
 * Easier to debug
 *----------------
 * DISADVANTAGES:
 * Sometimes slower.
 * Uses more memory
 * **/
public class Recursion {
    public static void main(String[] args) {
//        walk(5000000);//StackOverflow Error
        System.out.println(factorial(4));
        System.out.println(power(4,2));
    }

    private static int power(int base, int exponent) {
        if(exponent < 1 ) return 1;
        return  base * power(base,exponent - 1);
    }

    private static int factorial(int factor) {
        if (factor < 1) return -1;//base case
        //prevents returning negative number
        return ((factor * factorial(factor - 1)) < 0) ?  (factor * factorial(factor - 1)) * -1 : (factor * factorial(factor - 1));
    }

    private static void walk(int steps) {
        if(steps < 1) return; //base case
        System.out.println("you take a step"+steps);
        walk(steps - 1);
    }



}
