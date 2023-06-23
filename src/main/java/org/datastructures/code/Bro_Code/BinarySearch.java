package org.datastructures.code.Bro_Code;

import java.util.Arrays;

/**Finds target position within a SORTED ARRAY. Half of the element is eliminated during each step
 * ADV: Efficient when working with an extremely large data set***/
public class BinarySearch {
    public static void main(String[] args) {
        int array [] =new int[1000000000];
        int target = 434232;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//        int index = Arrays.binarySearch(array,target);
        int index = binarySearch(array,target);
        if (index!=-1){
            System.out.println("Element found at : "+index);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length-1;
        while (start <=end){
            int middle = start + (end - start)/2;
            int middleValue = array[middle];
             if (middleValue < target) start = middle + 1;
             else if (middleValue > target) end = middle - 1;
             else return  middle;
        }
        return  -1;
    }
}
