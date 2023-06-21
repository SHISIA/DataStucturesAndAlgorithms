package org.datastructures.code.Chapter_6_Efificient_Sort_Quick_and_MergeSort;

import java.util.Arrays;
import java.util.Comparator;

import org.datastructures.code.Chapter_5_Efficient_Searching.SelectionSort;
import org.datastructures.code.chapter_4.Person;

public class QuickSort {
    
    public static <E> void quickSort(E[] array, int start, int end, Comparator<E> comparator){
        if(end - start <= 0){
            return;
        }
        int i = start;
        int j = end - 1;
        boolean movingI = true;
        while(i < j){
            if(comparator.compare(array[i], array[j]) > 0){
                SelectionSort.swap(array, i , j);
                movingI = !movingI;
            }else{
                if(movingI){
                    i++;
                }else{
                    j--;
                }
            }
        }
        quickSort(array, start, i, comparator);
        quickSort(array, i + 1, end, comparator);
    }

    //wrapping this method to avoid passing start and end parameters
    public static <E> void quickSort(E[] array, Comparator<E> comparator){
        quickSort(array,0, array.length, comparator);
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,3,5,66,23,10,4,55,22323,54,89,100,0,0};
//         Note how we passed the simple comparator using a lambda. If we pass a lambda
// (a,b)->b-a instead, we will get the array reversed.
//n fact, this flexibility lets ussort arrays containing complex objects according to any comparison we like. For
// example, it is easy to sort an array of Person objects by age using the lambda, (p1,
// p2)->p1.getAge() - p2.getAge().
        quickSort(array, (a,b) -> a -b);
        quickSort(array, (a,b) -> b-a); //This reverses the array
        System.out.println(Arrays.toString(array));
    }
}
