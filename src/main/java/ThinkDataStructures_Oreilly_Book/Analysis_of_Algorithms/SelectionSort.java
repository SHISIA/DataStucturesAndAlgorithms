package ThinkDataStructures_Oreilly_Book.Analysis_of_Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    /**Swap the elements at indices i and j
     * @Note: you can use it the otehr way, that is swapping from i to j,
     * the catch here is the middle temporary variable temp which holds a  value for swapping**/
    public static void swapElements(int[] array,int i, int j){
        int temp = array[j];
        array[j] = array[i];
        array[i]=temp;
    }

    /**
     * Finds the index of the lowest value
     *
     */
    public static int indexLowest(int[] array, int start){
        int lowIndex = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < array[lowIndex]){
                lowIndex=i;
            }
        }
        return lowIndex;
    }

    /**
     * Sorts the elements (in place) using selection sort.
     **/
    public static int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int j = indexLowest(array,i);
            swapElements(array,i,j);
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{2, 5, 3, 4, 12, 3, 1, 0})));
    }
}
