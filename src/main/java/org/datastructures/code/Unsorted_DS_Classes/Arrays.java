package org.datastructures.code.Unsorted_DS_Classes;

public class Arrays {
    public static void main(String[] args) {
        
    }

    public static void insertElementAtIndex(int[] array,int startIndex,int targetIndex) {
        int value = array[startIndex];
        
        if(startIndex==targetIndex){
            return;
        }else if(startIndex < targetIndex){
            for(int i=startIndex+1;i<=targetIndex;i++){
                array[i-1]=array[i];
            }
            array[targetIndex]=value;
        }else{
            for (int i = startIndex-1; i >= targetIndex; i--) {
                array[i+1]=array[i];
            }
            array[targetIndex]=value;
        }
    }
}
