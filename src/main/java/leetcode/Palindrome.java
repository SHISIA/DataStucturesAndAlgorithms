package leetcode;

public class Palindrome {
        public static boolean isPalindrome(int x) {
            int reverse = 0;
            int prev=x;
            if(x < 0){
                return false;
            }
            while(x!=0){
                //Take the number's modulo by 10
                int remainder = x % 10;
//                System.out.println(remainder);
                //multiply the reverse by 10 and add the number obtained from the modulo 10 of the number
                reverse = reverse * 10 + remainder;

                //get the modulo 10 of the number
                x = x / 10;
                //repeat until 0
            }

            return reverse ==prev ;
        }

//    public static void main(String[] args) {
//        System.out.println("here "+isPalindrome(11));
//    }
}

