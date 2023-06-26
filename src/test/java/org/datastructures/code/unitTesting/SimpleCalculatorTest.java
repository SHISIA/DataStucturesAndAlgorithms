package org.datastructures.code.unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
     void twoPlusTwoShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void twoPlusSevenShouldEqualNine(){
        var calculator = new SimpleCalculator();
        assertEquals(9,calculator.add(2,7));
    }

}