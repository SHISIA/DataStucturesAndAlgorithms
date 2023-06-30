package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {

    @BeforeEach
    public void before(){

    }
    @Test
    void xlvEquals45() {
        Roman roman=new Roman();
        assertEquals(45,roman.romanToInt("XLV"));
    }
    @Test
    void iiiEqualsThree(){
        Roman roman=new Roman();
        assertEquals(3,roman.romanToInt("III"));
    }

    @Test
    void iiiiEqualsFour(){
        Roman roman=new Roman();
        assertEquals(4,roman.romanToInt("IIII"));
    }

    @Test
    void MMMDCCXXIVEqualsFour(){
        Roman roman=new Roman();
        assertEquals(3724,roman.romanToInt("MMMDCCXXIV"));
    }

    @Test
    void oneArgEqualsSameNumber(){
        Roman roman=new Roman();
        assertEquals(1000,roman.romanToInt("M"));
    }

    @Test
    void noCharEqualsNegativeOne(){
        Roman roman=new Roman();
        assertEquals(-1,roman.romanToInt(""));
    }
}