package org.datastructures.code.Bro_Code;

/**
 * BUBBLE SORT
 * Compares adjacent element and sees if they are in order, if not, they are switched and the next pair is compared until
 * they are in order and continues that way until the whole elements are sorted.
 * Runtime complexity of qudratic time : O(n^2) (bad): Okay only for the smallest datasets
 * **/
public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {9,1,1,8,2,7,3,6,4,5};
        bubbleSort(array);
        for (int i : array){
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                    int temp =  array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
