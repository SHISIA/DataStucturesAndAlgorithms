package org.datastructures.code.Chapter_6_Efificient_Sort_Quick_and_MergeSort;

import java.util.Comparator;

// We copy whichever of them is smaller to the target location and increment the
// corresponding current position. We keep doing this until we finish one of the arrays,
// after which the elements of the other array can just be copied over. The following
// shows the code for the merge operation. One thing to note is that, since the merge
// will be used for a mergesort, it presumes both the input arrays to be the same array
// with different indexes and the target arrays to have the same size. The source has
// three indexes: start, mid, and end. It is assumed that the source parts are residing
// side by side in the source array. The variable start points to the start of the first
// part. The integer mid stores the index of the start of the second part and also acts as
// the end of the first part, as the parts are contiguous. Finally, the end variable stores
// the end of the second array:
public class MergeSort {

    //this is 
    private static <E> void merge(E[] array, int start , int mid, int end , E[] targetArray, Comparator<E> comparator){
        int i= start;
        int j = mid;
        int k = start;
        while(k < end){
//The first two cases are for the time when one of the source arrays has been
// exhausted:
            if(i == mid){
                targetArray[k] = array[j];
                j ++ ;
            }else if(j == end){
                targetArray[k] = array[i];
                i++;
            }
            // If none of the arrays are exhausted, copy from the correct array:
            else if(comparator.compare(array[i], array[j]) > 0){
                targetArray[k] = array[j];
                j++;
            }else{
                targetArray[k] = array[i];
                i++;
            }
            // Finally, the target location must also be incremented:
            k++;
        }
    }

//     1. Divide the array into two equal parts.
// 2. Mergesort the parts.
// 3. Merge the sorted parts into a full sorted array.

    public static <E> void mergeSort(E[] sourceArray, int start, int end, E[] tempArray, Comparator<E> comparator){
//         Just return to the calling function for an array of zero or one element. This is our
// base case:
        if(start >= end - 1){
            return;
        }

//         For any array of size bigger than 1, divide the array into two halves–start to mid
// and mid to end. Then merge-sort them separately, and then merge the two sorted
// subarrays to a combined sorted array in tempArray, which is an auxiliary space that
// we are using:
        int mid = (start + end)/2;
        mergeSort(sourceArray, start, mid, tempArray, comparator);
        mergeSort(sourceArray, mid, end, tempArray, comparator);
        merge(sourceArray, start, mid, end, tempArray, comparator);

//         Finally, copy the contents of tempArray to sourceArray so that the source is
// now sorted:
        System.arraycopy(tempArray,start,sourceArray,start,end  - start);
    }
    
    /***Avoiding the copying of tempArray??* */

    
}
