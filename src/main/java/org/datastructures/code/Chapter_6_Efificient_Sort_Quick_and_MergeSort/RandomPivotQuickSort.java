package org.datastructures.code.Chapter_6_Efificient_Sort_Quick_and_MergeSort;

import java.util.Comparator;

import org.datastructures.code.Chapter_5_Efficient_Searching.SelectionSort;

public class RandomPivotQuickSort {
    public static <E> void quickSort(E[] array, int start, int end, Comparator<E> comparator){
        if(end  - start <= 0){
            return;
        }
        int pivotIndex = (int) ((end - start) * Math.random()) + start;
        SelectionSort.swap(array, pivotIndex, end - 1);
        //let's find the pivot
        int i = start;
        int j = end - 1;
        boolean movingI = true;
        while(i < j){
            if(comparator.compare(array[i], array[j]) > 0){
                SelectionSort.swap(array, i, j);
                movingI = !movingI;
            }else{
                if(movingI){
                    i++;
                }else{
                    j--;
                }
            }
        }
        quickSort(array, start, i, comparator);
        quickSort(array, i + 1, end, comparator);
    }
}
