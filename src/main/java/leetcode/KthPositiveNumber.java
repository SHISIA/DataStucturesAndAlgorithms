package leetcode;

import java.util.HashSet;
import java.util.Set;

/**Link (LeetCode Easy) : https://leetcode.com/problems/kth-missing-positive-number/
 * Time = 4ms
 * O(n)
 **/
public class KthPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        //stores arr available values
        Set<Integer> set=new HashSet<>();
        //keeps the count of the positive numbers that are missing in the given array to the Kth positive.
        int count=0;
        //arithmetic progression formula:: gives us sum from one to arr[arr.length-1](last element of our array)
        int actualSum=arr[arr.length-1]*(1+arr[arr.length-1])/2;
        //last element of our array
        int lastElement = arr[arr.length - 1];
        //keeps sum of the elements of the given array
        int arrSum=0;
        //add the values to our set and sum the value into our set
        for(int i:arr){
            set.add(i);
            arrSum+=i;
        }
        //if actual sum and array sum are equal, means there are no in between missing values, so we increment from the last
        //element k times to the kth element
        if(actualSum==arrSum){
            return lastElement + k;
        }
        //reaching here means the actual sum is not equal to the sum of the array, hence there are missing values
        //we loop from 1 to the last values of arr+k (we add k so that we do not miss some values during counting)
        //if the set doesn't contain the value at i, means we have found a missing value,so we increment count,
        // if  count reaches the kth element(i.e count == k), we have reached our target kth element so we return the element
        for(int i=1;i<=arr[arr.length - 1]+k;i++){
            if(!(set.contains(i))){
                count++;
            }
            //we found the kth element,so we return i, since it is at k position
            if(count == k){
               return i;
            }
        }
        //return anything in case of an anomaly;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{5,6,7,8,9},9));
    }
    /** The kth positive . Optimized, runtime 0ms , time complexity O(1) **/
    public int findTheKthPositive(int[] arr, int k) {
        int i=1,j=1,x=0;
        while(true){
            if(x<arr.length && arr[x]==j){
                x++;
                j++;
                continue;
            }
            if(i==k){
                return j;
            }
            i++;j++;
        }
    }
}
