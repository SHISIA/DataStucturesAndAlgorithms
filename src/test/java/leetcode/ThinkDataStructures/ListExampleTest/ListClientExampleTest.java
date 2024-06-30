package leetcode.ThinkDataStructures.ListExampleTest;

import ThinkDataStructures_Oreilly_Book.List_Interface_In_Java.ListClientExample;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class ListClientExampleTest {
    @Test
    public void checkResultIsArrayList(){
        ListClientExample listClientExample=new ListClientExample();
        assertTrue(listClientExample.getList() instanceof ArrayList);
    }

}
