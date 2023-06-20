package org.datastructures.code.Chpater_5_Efficient_Searching;

import java.util.Arrays;

public class SelectionSort {

    public static <E extends Comparable<E>> int findMinimum(E[] array,int start){

//         Then, we check whether the start position is the last position in the array, in which
// case we just simply return the start position as there are no more elements
        if(start == array.length-1){
            return start;
        }

//         We find the index of the minimum element in the array to the right of the current
// start position and compare that element with the current start element. We return
// whichever has the minimum element
        int restminIndex = findMinimum(array, start+1);
        E  restMin = array[restminIndex];
        if(restMin.compareTo(array[start])<0){
            return restminIndex;
        }else{
            return start;
        }

    }

//     The swap function swaps or interchanges two elements in the array at the given
// positions. This function is pretty straightforward:

public static <E> void swap(E[] array, int i, int j){
    if(i==j){
        return;
    }
    E temp = array[i];
    array[i]=array[j];
    array[j]=temp;
}

public static <E extends Comparable<E>> void selectionSort(E[] array,int start){
    //Firstly, there is no sorting to be done if the array is empty:
    if(start >= array.length){
        return;
    }

//     Now, we just find the index of the minimum element and swap the current position
// with the index of the minimum position. This will put the minimum element in the
// current position:
    int minElement = findMinimum(array, start);
    swap(array, start, minElement);
    // Then, we recursively sort the rest of the array:
    //NB: The start is always zero
    selectionSort(array, start+1);
}

public static void main(String[] args) {
    Integer[] array = new Integer[]{10,40,30,25,15,70,100};
    selectionSort(array, 0);
    System.out.println(Arrays.toString(array));
}

}
