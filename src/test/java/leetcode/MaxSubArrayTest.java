package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubArrayTest {
    @Test
    void maxSubArrayNegative(){
        assertEquals(-1,MaxSubArray.maxSubArray(new int[]{-3,-1,-9,-4,-5,-2}));
    }
    @Test
    void maxSubArrayNegative_Two(){
        assertEquals(-2,MaxSubArray.maxSubArray(new int[]{-3,-9,-4,-5,-2}));
    }

    @Test
    void maxSubArrayOneArg(){
        assertEquals(9,MaxSubArray.maxSubArray(new int[]{9}));
    }

    @Test
    void maxSubArrayOnePositive(){
        assertEquals(9,MaxSubArray.maxSubArray(new int[]{-3,-9,9,-5,-2}));
    }

    @Test
    void maxSubArrayException(){
        assertThrows(IllegalArgumentException.class,
                ()-> MaxSubArray.maxSubArray(new int[]{})
                );
    }

    @Test
    void maxSubArrayExceptionMessage(){
        assertThrows(IllegalArgumentException.class,
                ()-> MaxSubArray.maxSubArray(new int[]{}),"Empty Array"
        );
    }
}