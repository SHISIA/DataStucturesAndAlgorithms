package org.datastructures.code.Bro_Code;
/**INSERTION SORT
 * check whether the left element(s) are less than the current element, if not, SHIFT THEM TO THE RIGHT
 * until there remains only those less than the current ,insert the current such that it is greater than the left elements, move to the
 * next value until all are sorted
 * Runtime complexity of BEST CASE O(n) compared to SELECTION SORT's O(n^2)
 * LESS steps than BUBBLE SORT.**/
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {9,1,8,2,7,3,6,5,4};
        insertionSort(array);
        for (int i : array){
            System.out.println(i+" ");
        }
    }

    //the first sort algorithm I did without fully confirming from a tutorial. Independently
    //You can do it too
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length;i++){
            int temp = array[i];
            int j = i - 1;
            while (j>=0 && array[j]>temp){
               array[j+1]=array[j];
               array[j]=temp;
               j--;
            }
        }
    }

}
