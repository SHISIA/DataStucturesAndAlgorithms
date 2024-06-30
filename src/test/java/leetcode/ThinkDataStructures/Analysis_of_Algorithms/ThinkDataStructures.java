package leetcode.ThinkDataStructures.Analysis_of_Algorithms;

import ThinkDataStructures_Oreilly_Book.Analysis_of_Algorithms.SelectionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThinkDataStructures {
    @Test
    public void testSelectionSort(){
        Assertions.assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8},
        SelectionSort.selectionSort(new int[]{8,1,3,2,7,6,4,5,0}));
    }
}
