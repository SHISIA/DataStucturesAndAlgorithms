package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public  int romanToInt(String s){

        Map<Character,Integer> map = Map.of(
                'I',1,
                'V', 5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000);

        char[] chars = s.toCharArray();
        int result=0;
        int previous=0;
        if (chars.length == 0){
            return -1;
        }
        if (chars.length == 1){
            return map.get(chars[0]);
        }
        for (int i =chars.length-1; i>=0;i--) {
            int number = map.get(chars[i]);
            if (number < previous){
                result-=number;
            }else
                result+=number;
            previous = number;
        }
        return result;
    }
//    public static void main(String[] args) {
////        System.out.println("Number "+romanToInt("III"));
//    }
}
