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
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String> arr_=new ArrayList<>();
        int counter = 0;
        for (String s : strArr) {
            if (stringSet.contains(s+"-")) {
                stringSet.remove(s+"-");
            }
            stringSet.add(s+"-");
        }

        //reverse the string getting the last five elements
        for (int i = stringSet.size()-1; i >=0; i--) {
            //terminate loop after getting the last five elements
            if (counter==5){
                break;
            }
            arr.add(stringSet.get(i));
            counter++;
        }
        //reverse to get the normal initial order
        for (int i = arr.size()-1; i >=0; i--) {
            arr_.add(arr.get(i));
        }
        StringBuilder stringBuilder=new StringBuilder();
        //convert our array to a string
        for (String str:arr_){
            stringBuilder.append(str);
        }
         stringBuilder.deleteCharAt(stringBuilder.length()-1);
        System.out.println("dfd "+stringBuilder);

        stringBuilder.append("t9edj70y31b");
        //replace every third element
        for (int i=2;i<stringBuilder.length();i+=3){
            stringBuilder.setCharAt(i,'X');
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.printf(arrayChallenge(new String[]{"A", "B", "A", "C", "A", "B"}));
    }
}
