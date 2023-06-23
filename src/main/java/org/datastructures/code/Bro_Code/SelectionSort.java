package org.datastructures.code.Bro_Code;

/**
 * SELECTION SORT:
 * search through an array and keep track of the minimum value during each iteration, while swapping values at each iteration
 * Runtime complexity O(n^2): quadratic time.
 * BAD with large data sets.
 * Ok with the smallest datasets**/
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {8,8,7,9,2,3,1,5,4,6};
        selectionSort(array);

        for (int i :array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j])
                    min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
