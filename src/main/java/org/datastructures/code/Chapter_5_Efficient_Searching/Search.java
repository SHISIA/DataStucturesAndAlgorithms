package org.datastructures.code.Chapter_5_Efficient_Searching;

/**Binary Number Search* */
public class Search {

     public static void main(String[] arg) {
        int[] numbers = {10,20,23,31,34,56,67,78,90,100};
        System.out.println(new Search().finalsearch(numbers, 67));
    }

    public Integer finalsearch(int[] numbers,int valueToFind){
        return search(numbers, 0, numbers.length, valueToFind);
    }

    public  Integer search(int[] values,int start, int end, int valueTofind){
        if(start>=end){
            return -1;
        }
        int midIndex = (start+end)/2;
        int comparator = compareTo(values[midIndex], valueTofind);
        if(comparator == 0 ){
            return midIndex;
        }else if(comparator > 0){
            return search(values, start, midIndex-1, valueTofind);
        }else{
            return search(values, midIndex+1, end, valueTofind);
        }
    }

    //this method was modified and is a more efficient method due to removal of the recursive calls
    //it will not cause a StackOverflow error
//     This conversion is not really required
// in case of a binary search though, because you need only lg n steps to search an array
// of length n.
    public  Integer searching(int[] values,int start, int end, int valueTofind){
        while(true){
            if(start>=end){
            return -1;
        }
        int midIndex = (start+end)/2;
        int comparator = compareTo(values[midIndex], valueTofind);
        if(comparator == 0 ){
            return midIndex;
        }else if(comparator > 0){
            end = midIndex;
        }else{
            start = midIndex + 1;
        }
        }

    }

    static int compareTo(int firstNum,int secondnum){
        if(firstNum == secondnum){
            return 0;
        }else if(firstNum > secondnum){
            return 1;
        }else{
            return -1;
        }
    }
    
}
