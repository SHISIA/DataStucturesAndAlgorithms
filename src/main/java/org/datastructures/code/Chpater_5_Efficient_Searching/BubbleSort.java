package org.datastructures.code.Chpater_5_Efficient_Searching;

// • Scan through the array, searching pairs of consecutive elements that are
// ordered wrongly. Then find a j, such that array[j+1] < array[j].
// • Whenever such a pair is found, swap them and continue searching until the
// end of the array and then back from the beginning again.
// • Stop when a scan through the entire array does not even find a single
// pair.
public class BubbleSort {

    public static <E extends Comparable<E>> void bubbleSort(E[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i=0;i <array.length - 1 ; i++){
                if(array[i].compareTo(array[i+1]) > 0){
                    SelectionSort.swap(array, i, i+1);
                    sorted = false;
                }
            }
        }
    }
    
}
