package leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int elements = strs.length;
        char[] first=strs[0].toCharArray();
        char[] last=strs[elements-1].toCharArray();
        int workingLength=0;
        StringBuilder builder=new StringBuilder();
        if(strs.length==1){
            return strs[0];
        }
        if (first.length<last.length){
            workingLength=first.length;
        }else{
            workingLength=last.length;
        }
        for (int i=0;i<workingLength;i++){
                if (first[i]!=last[i]){
                    return builder.toString();
                }
            builder.append(first[i]);
        }
        return builder.toString();
    }

    //Test method
//    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
//    }
}
