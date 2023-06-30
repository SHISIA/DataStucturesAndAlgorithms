package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void oneTwentyOneIsPalindrome(){
        assertTrue(Palindrome.isPalindrome(121));
    }

    @Test
    void fiftyThreeIsNotPalindrome(){
        assertFalse(Palindrome.isPalindrome(53));
    }

    @Test
    void negativeNumberIsNotPalindrome(){
        assertFalse(Palindrome.isPalindrome(-53));
    }
}