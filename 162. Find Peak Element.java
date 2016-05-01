public class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid;
        while (start + 1 < end){
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid - 1]){
                if (nums[mid] > nums[mid + 1]){
                    return mid;
                }
                else {
                    start = mid;
                }
            }
            else {
                if (nums[mid] > nums[mid + 1]){
                    end = mid;
                }
                else {
                    end = mid;
                }
            }
        }
        
        if (nums[start] > nums[end]){
            return start;
        }
        else {
            return end;
        }
    }
}
