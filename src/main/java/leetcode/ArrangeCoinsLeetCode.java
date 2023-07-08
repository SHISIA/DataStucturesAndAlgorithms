package leetcode;

/**LeetCode Easy problem:
 *Link --> https://leetcode.com/problems/arranging-coins/ **/
public class ArrangeCoinsLeetCode {
    public int arrangeCoins(int n) {
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
}
