package leetcode.ListExampleTest;

import List_Interface_In_Java.ListClientExample;
import org.datastructures.code.chapter_4.Option;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;


class ListClientExampleTest {
    @Test
    public void checkResultIsArrayList(){
        ListClientExample listClientExample=new ListClientExample();
        assertTrue(listClientExample.getList() instanceof ArrayList);
    }

}
