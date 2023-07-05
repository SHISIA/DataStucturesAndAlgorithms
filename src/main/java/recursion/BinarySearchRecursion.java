package recursion;

/**Binary Search using Recursion
 * Always make sure it is a sorted array for Binary Search to work effectively, though it
 * also works for unsorted values**/
public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr=new int[]{20,2,12,3,5,6,7,5,8};
        System.out.println(search(arr,7,0,arr.length-1));
    }

    static int search(int[] n,int target,int start, int end){
        if(start>end){
            //we don't have the target in our array, so we return -1 and exit;
            return  -1;
        }
        //divide the array into two parts (divide and conquer) and get a middle value
        int mid = start + (end - start)/2;
        //if our mid-value is greater than our target, that means our target exists in the left side
        // of the divided array, which means our end value will be less than our current mid-value so we give it the next value
        //just before our mid
        if (n[mid]==target){
            return mid;
        }
        if(n[mid] > target){
            return search(n,target,start,mid-1);
        }
        //if all above conditions are not met, our target will be on the right side of the array, so our target
        //must exist on our right side of the divided array(the right portion)
        //that means that our target is greater than the current mid-value so we start from mid + 1 (the next element just after our current mid-value)
        return search(n,target,mid+1,end);
    }
}
