package org.datastructures.code.Chapter_6_Efificient_Sort_Quick_and_MergeSort;

/*A subarray is a contiguous part of array. An array that is inside another array. For example, consider the array [1, 2, 3, 4],
 There are 10 non-empty sub-arrays. The subarrays are (1), (2), (3), (4), (1,2), (2,3), (3,4), (1,2,3), (2,3,4) and (1,2,3,4).
  In general, for an array/string of size n, there are n*(n+1)/2 non-empty subarrays/substrings.
*/
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
