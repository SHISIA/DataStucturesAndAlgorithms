package coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <b style="font-size:30;color:orange;"><br>Array Challenge</b>
 * <br>
 * <b>This is a question I was asked from <b style="font-size:20;color:orange;">CoderByte</b> during an interview
**<br>Kindly refer to the LRUCache.md file for instructions</b>**/
public class LRUCache {
    public static String arrayChallenge(String[] strArr){
        ArrayList<String> stringSet=new ArrayList<>();
        String[] arr=new String[5];
        String[] arr_=new String[5];
        int counter = 0;
        for (String s : strArr) {
            if (stringSet.contains(s+"-")) {
                stringSet.remove(s+"-");
            }
            stringSet.add(s+"-");
        }

        //reverse the string getting the last five elements
        for (int i = stringSet.size()-1; i >=0; i--) {

            if (counter==5){
                break;
            }
            arr[counter]=stringSet.get(i);
            counter++;
        }
        //reuse counter to count our values
        counter=0;
        //reverse to get the normal orde
        for (int i = arr.length-1; i >=0; i--) {
            arr_[counter++]=arr[i];
        }
        StringBuilder stringBuilder=new StringBuilder();
        //convert our array to a string
        for (String str:arr_){
            stringBuilder.append(str);
        }
         stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("t9edj70y31b");
        //replace every third element
        for (int i=2;i<stringBuilder.length();i+=3){
            stringBuilder.setCharAt(i,'X');
        }

        return strArr[0];
    }

    public static void main(String[] args) {
        System.out.printf(arrayChallenge(new String[]{"A", "B", "C", "D", "A", "E", "D", "Z"}));
    }
}
