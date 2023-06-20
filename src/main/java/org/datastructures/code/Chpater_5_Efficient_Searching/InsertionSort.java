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

    //principle of converting a tail recursion into a loop.
    //Note that there is no operation pending after the recursive call to itself. But we need
// to be a little more careful here. Note that the invocation only happens inside a code
// branch. The else case is implicit here, which is else { return; }. We need to make
// it explicit in our code first
     public static <E extends Comparable<E>> void insertElementSortedUpdated(E[] array, int valueIndex){
        while(true){
            if(valueIndex > 0 && array[valueIndex].compareTo(array[valueIndex-1]) < 0){
            SelectionSort.swap(array, valueIndex, valueIndex-1);
            // insertElementSortedUpdated(array, valueIndex -1); -- replaced this : converting a tail recursion to a loop
            valueIndex =valueIndex - 1;
        }
        //we added a else
        else{
            return;
            }
        }
    }

    public static <E extends Comparable<E>> void insertionSort(E[] array, int boundary){
        if(boundary==0){
            return;
        }
        insertionSort(array, boundary-1);
        insertElementSorted(array, boundary);
    }

    //we
    //represent these partial arrays with, simply, a boundary value
    //refactored recursive function
    //Note that in this case, the function return type is void. But what we are really
// returning is the sorted array; we just resorted to modifying the same array to avoid
// creating duplicate arrays.
    public static <E extends Comparable<E>> void insertionSort(E[] array){
        for(int boundary = 0 ; boundary<array.length;boundary++){
        insertElementSorted(array, boundary);
        }
    }
}
