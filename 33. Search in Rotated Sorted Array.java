public class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid; 
        while (start + 1 < end){
            mid = (start + end)/ 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] > nums[start]){
                if (nums[start] <= target && nums[mid] > target){
                    end = mid;
                }
                else {
                    start = mid;
                }
            }
            
            else {
                if (nums[end] >= target && nums[mid] <= target){
                    start = mid;
                }
                else {
                    end = mid;
                }
            }
        
        }
        if (nums[start] == target){
            return start;
        }
        else if (nums[end] == target){
            return end;
        }
        
        return -1;
    }
}
