package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static int romanToInt(String s){

        Map<Character,Integer> map = Map.of(
                'I',1,
                'V', 5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000);
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i=0;i<chars.length-1;i++){
            result = chars[i];
            System.out.println("tije "+chars[0]);
            if (map.get(chars[i]) >= map.get(chars[i+1])){
                result +=map.get(chars[i]);
            }else {
                result-=map.get(chars[i]);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("X"));
    }
}
