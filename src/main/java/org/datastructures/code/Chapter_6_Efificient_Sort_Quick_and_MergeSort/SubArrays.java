package org.datastructures.code.Chapter_6_Efificient_Sort_Quick_and_MergeSort;


// Java program to generate all possible subarrays/subArrays
//  Complexity- O(n^3) */
public class SubArrays {
    public static void main(String[] args) {
        System.out.println("All non-empty arrays");
        int[] arr=new int[]{1,2,3,4,5};
        subArray(arr.length, arr);
    }

    static void subArray(int n,int[] array){
        //starting point
        for(int i=0; i< n;i++){
            //ending point
            for(int j=i;j<n;j++){
                //print subarray between current starting and ending points
                for(int k=i;k<=j;k++){
                    System.out.println(array[k]+" ");
                }
                System.out.println("\n");
            }
        }
    }
}
