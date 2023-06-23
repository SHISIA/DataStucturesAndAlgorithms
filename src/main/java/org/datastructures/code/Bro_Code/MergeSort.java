package org.datastructures.code.Bro_Code;

import java.util.Arrays;
import java.util.List;

/**MERGESORT -> runtime complexity of  O(n log n)
 * Faster than Insertion sort, selection sort and bubble sort but uses more space than them
 * Bubble sort uses a constant amount of space to do its sorting
 * :::divides an array into two **/
//not yet fixed: Has a bug
public class MergeSort {
    public static void main(String[] args) {
        int array[] = {1,2,4,56,3,7,8,9,9,12,29283,33};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length < 1) return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[]  rightArray= new int[length - middle];
        int i = 0; //rightArray
        int j= 0;//leftArray;
        for (;i<length;i++){
            if (i < middle){
                leftArray[i]=array[i];
            }else {
                rightArray[j]=array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(rightArray,leftArray,array);

    }

    private static void merge(int[] rightArray, int[] leftArray, int[] array) {
        int leftSize =leftArray.length/2;
        int rightSize = array.length - leftSize;
        int i =0, l=0, r=0;
        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
