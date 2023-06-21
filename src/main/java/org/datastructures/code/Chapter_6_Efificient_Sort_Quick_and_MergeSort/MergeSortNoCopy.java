package org.datastructures.code.Chapter_6_Efificient_Sort_Quick_and_MergeSort;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSortNoCopy {

    private static <E> void merge(E[] arrayL, E[] arrayR, int start, int mid, int end, E[] targetArray, Comparator<E> comparator){
        int  i =start;
        int j = mid;
        int k = start;
        while(k < end){
            if(i==mid){
                targetArray[k] = arrayR[j];
                j++;
            }else if(j == end){
                targetArray[k] = arrayL[i];
                i++;
            }else if(comparator.compare(arrayL[i], arrayR[j]) > 0){
                targetArray[k] = arrayR[j];
                j++;
            }else{
                targetArray[k] = arrayL[i];
                i++;
            }
            k++;
        }

    }

//     With this merge function available, we write our efficient mergesort in the following
// way. Note that we need some way to inform the calling function about which preallocated array contains the result, so we return that array
    public static <E> E[] mergeSortNoCopy(E[] sourceArray, int start, int end, E[] tempArray, Comparator<E> comparator) {
        if(start >= end - 1){
            return sourceArray;
        }
        // First, split and merge-sort the sub-arrays as usual:
        int mid = (start + end )/2;
        E[] sortedPart1 = mergeSortNoCopy(sourceArray, start, mid, tempArray, comparator);
        E[] sortedPart2 = mergeSortNoCopy(sourceArray, mid, end, tempArray, comparator);

//         If both the sorted sub-arrays are stored in the same pre-allocated array, use the other
// pre-allocated array to store the result of the merge:
        if(sortedPart1 == sortedPart2){
            if(sortedPart1 == sourceArray){
                merge(sortedPart1, sortedPart2, start, mid, end, tempArray, comparator);
                return tempArray;
            }else{
            merge(sortedPart1, sortedPart2, start, mid, end, sourceArray, comparator);
            return sourceArray;
        }

        }else{
            //In this case, we store the result in sortedPart2 because it has the first portion empty:
            merge(sortedPart1, sortedPart2, start, mid, end, sortedPart2, comparator);
            return sortedPart2;
        }
    }

    // /Now we can use this mergesort as follows:
    public static void main(String[] args) {
        Integer[] anArray = new Integer[]{0,45,78,90,30,29,43,23,432,45,(30*10)};
        Integer[] anotherArray = new Integer[anArray.length];
        anArray = mergeSortNoCopy(anArray, 0, anArray.length, anotherArray, (a,b)-> a-b);
        System.out.println(Arrays.toString(anArray));
    }
    
}
