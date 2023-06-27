package org.datastructures.code.unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineReturnF(){
        var grader =new Grader();
        assertEquals('F',grader.returnLetterGrader(59));
    }
    @Test
    void sixtyNineReturnD(){
        var grader =new Grader();
        assertEquals('D',grader.returnLetterGrader(69));
    }

    @Test
    void seventyFiveReturnC(){
        var grader =new Grader();
        assertEquals('C',grader.returnLetterGrader(75));
    }

    @Test
    void eightyNineReturnB(){
        var grader =new Grader();
        assertEquals('B',grader.returnLetterGrader(89));
    }

    @Test
    void ninetyNineReturnA(){
        var grader =new Grader();
        assertEquals('Y',grader.returnLetterGrader(199));
    }

    @Test
    void lessThanZeroEqualsError(){
        var grader =new Grader();
        assertThrows(IllegalArgumentException.class,
                ()-> grader.returnLetterGrader(-1));
    }

    @Test
    void moreThanHundred(){
        var grader =new Grader();
        assertEquals('A',grader.returnLetterGrader(99));
    }

    @Test
    void moreThanHundredNotEqual(){
        var grader =new Grader();
        assertEquals('Y',grader.returnLetterGrader(101));
    }

}