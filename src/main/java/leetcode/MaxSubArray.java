package leetcode;

import java.util.*;

public class MaxSubArray {
    public static int maxSubArray(int[] nums){
       int sum=0;
       int max=Integer.MIN_VALUE;
       if (nums.length==1){
           return nums[0];
       }
       if (nums.length==0){
           throw new IllegalArgumentException("Empty Array");
       }
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            max =Math.max(sum,max);
            if (sum<0) sum =0;
        }
        System.gc();
        return max;
    }

//    public static void main(String[] args) {
//        System.out.println(maxSubArray(new int[]{-2,-1}));;
//    }
}
