package leetcode;

import java.util.Arrays;

/**
 * Link -> https://leetcode.com/problems/fair-candy-swap/
 * Alice and Bob have a different total number of candies.
 * You are given two integer arrays aliceSizes and bobSizes
 * where aliceSizes[i] is the number of candies of the ith box of candy that
 * Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
 Since they are friends, they would like to exchange one candy box each so that after the exchange,
 they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
 Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange,
 and answer[1] is the number of candies in the box that Bob must exchange.
 If there are multiple answers, you may return any one of them.
 It is guaranteed that at least one answer exists.*/
public class FairCandySwap {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
        int countBob=0, countAlice=0;
        for(int i: aliceSizes){
            countAlice+=i;
        }
        for(int j: bobSizes){
            countBob+=j;
        }

        for(int i=0;i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(countAlice-aliceSizes[i]+bobSizes[j]==
                        countBob-bobSizes[j]+aliceSizes[i])
                    return new int[]{aliceSizes[i],bobSizes[j]};
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{2},new int[]{1,3})));
    }
}
