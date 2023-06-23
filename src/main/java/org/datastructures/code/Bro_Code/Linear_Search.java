package org.datastructures.code.Bro_Code;

/**Runtime complexity O(n)**/
/**DisaDvantage: Slow for large data sets**/
/**ADV:
 *  Fast for searches
 * Does not need to be sorted
 * Useful for data structures that do not have random ACCESS (LinkedList)
 * **/
public class Linear_Search {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,5,6,7,3};
        int index = linearSearch(array,1);
        if (index != -1){
            System.out.println("Element found  at index: "+index);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==value){
                return i;
            }
        }return  -1;
    }
}
