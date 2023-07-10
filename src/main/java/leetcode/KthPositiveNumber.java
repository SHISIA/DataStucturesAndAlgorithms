package leetcode;

import java.util.HashSet;
import java.util.Set;

/**Link (LeetCode Easy) : https://leetcode.com/problems/kth-missing-positive-number/
 * Time = 10ms
 * O(n)
 * **/
public class KthPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        int actualSum=0;
        int lastElement = arr[arr.length - 1];
        for(int a=1;a<=arr[arr.length-1];a++){
            actualSum+=a;
        }
        // int actualSum= arr[arr.length-1] * (arr[0]-1)/2;

        int arrSum=0;

        for(int i:arr){
            set.add(i);
            arrSum+=i;
        }
        if(actualSum==arrSum){
            for(int i=1;i<=k;i++){
                lastElement++;
            }
            return lastElement;
        }else{
            for(int i=1;i<=arr[arr.length - 1]+k;i++){
                if(!(set.contains(i))){
                    count++;
                }
                System.out.println(count +" "+k);
                if(count == k){

                    return i;
                }
            }
        }


        return arrSum;
    }

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{5,6,7,8,9},9));
    }
}
