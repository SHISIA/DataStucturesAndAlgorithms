package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void oneCharString(){
        assertEquals("a",LongestCommonPrefix.longestCommonPrefix(new String[]{"a"}));
    }
    @Test
    void multipleCharString(){
        assertEquals("flow",LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flower","flowed"}));
    }

    @Test
    void noCharString(){
        assertEquals("",LongestCommonPrefix.longestCommonPrefix(new String[]{""}));
    }

    @Test
    void emptyArray(){
        assertEquals("",LongestCommonPrefix.longestCommonPrefix(new String[]{"apple","pie"}));
    }

}