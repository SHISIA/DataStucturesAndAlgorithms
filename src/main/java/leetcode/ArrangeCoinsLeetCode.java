package leetcode;

/**LeetCode Easy problem:
 *Link --> https://leetcode.com/problems/arranging-coins/ **/
/**@Problem_description : You have n coins and you want to build a staircase with these coins. The staircase consists
 * of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.**/
public class ArrangeCoinsLeetCode {
    public static int arrangeCoins(int n) {
        int total=n;
        int rowCount=0;
        for(int i=1;i<=n;i++){
            if(total<i){
                return rowCount;
            }
            total-=i;
            rowCount++;
        }
        return rowCount;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(900)+" Complete Rows of numbers where the row at any position i has i elements");
    }
}
