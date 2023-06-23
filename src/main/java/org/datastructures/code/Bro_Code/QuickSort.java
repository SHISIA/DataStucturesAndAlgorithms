package org.datastructures.code.Bro_Code;

import java.util.Arrays;

/**QUICKSORT: moves smaller elements to the left  of a pivot recursively divide array in 2 partitions
 * Runtime complexity = BEST CASE O(n log(n))
 * AVERAGE CASE O(n log(n))
 * WORST CASE O(n^2)) if already sorted
 * SPACE COMPLEXITY = O(log(n)) due to recursion
 * Has a pivot
 * find the final resting point of our chosen pivot**/
public class QuickSort {
    public static void main(String[] args) {
        int [] array = {1,3,45,6,8,90,3,4,5,7,4};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array,int beginning,int end) {
        if(end <=beginning) return;

        int pivot = partition(array,beginning,end);
        quickSort(array,beginning,pivot-1);
        quickSort(array,pivot+1,end);
    }

    private static int partition(int[] array, int beginning, int end) {
        int pivot = array[end];
        int i =beginning - 1;
        for (int j = beginning; j <= end -1;j++){
            if (array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j]=temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end]=temp;
//position of our pivot
        return i;
    }
}
