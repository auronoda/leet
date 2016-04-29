public class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid; 
        while (start + 1 < end){
            mid = (start + end)/ 2;
            if (nums[mid] == target){
                return true;
            }
            if (nums[mid] > nums[start]){
                if (nums[start] <= target && nums[mid] > target){
                    end = mid;
                }
                else {
                    start = mid;
                }
            }
            
            else if (nums[mid] < nums[start]){
                if (nums[end] >= target && nums[mid] <= target){
                    start = mid;
                }
                else {
                    end = mid;
                }
            }
            
            else {
              if (nums[start] > nums[end]){
                start = mid;
              }
              else {
                start = start + 1;
              }
            }
        
        }
        if (nums[start] == target){
            return true;
        }
        else if (nums[end] == target){
            return true;
        }
        
        return false;
    }
}
