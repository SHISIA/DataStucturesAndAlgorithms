package org.datastructures.code.Unsorted_DS_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class AddNumb {
    public static void main(String[] args) {
        int [] array = {8,6,2,7,8,9};
        System.out.println(Arrays.toString(add2(array,10)));
    }

    public static int[] add2(int[] array, int target){
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < array.length ; i++) {
            Integer complement = complements.get(array[i]);
            if (complement!=null ){
                return new int[]{complement,i};
            }
            complements.put(target - array[i], i);
        }

        return array;
    }

    public static int[] add(int[] array, int target){

        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return array;
    }

//    public static void addTwo(int[] array,int initial){
//        int target = 13;
//        if (array[initial]>=array.length){
//            return;
//        }
//        if(!(array[initial]+array[initial+1]==target)){
//
//            initial++;
//        }else {
//            return new int[]{array[initial],array[initial+1]};
//        }
//        addTwo(array,initial);
//    }
}
