public class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        if (nums[start] < nums[end]){
            return nums[start];
        }
        while (start + 1 < end){
            mid = (start + end) / 2;
            if (nums[start] < nums[mid]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        if (nums[start] < nums[end]){
            return nums[start];
        }
        else {
            return nums[end];
        }
    }
}
