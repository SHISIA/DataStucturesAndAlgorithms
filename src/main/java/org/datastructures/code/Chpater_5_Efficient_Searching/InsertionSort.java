package org.datastructures.code.Chpater_5_Efficient_Searching;

public class InsertionSort {
    
// The function takes an array and a position that
// represents this last position:
    public static <E extends Comparable<E>> void insertElementSorted(E[] array, int valueIndex){
        if(valueIndex > 0 && array[valueIndex].compareTo(array[valueIndex-1]) < 0){
            SelectionSort.swap(array, valueIndex, valueIndex-1);
            insertElementSorted(array, valueIndex -1);

        }
    }

    public static <E extends Comparable<E>> void insertionSort(E[] array, int boundary){
        if(boundary==0){
            return;
        }
        insertionSort(array, boundary-1);
        insertElementSorted(array, boundary);
    }
}
