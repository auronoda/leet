public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = 0;
        int sum = nums[0]; 
        int l = 0; 
        
        while (end < nums.length){
            if (sum < s){
                end++;
                if (end < nums.length){
                    sum += nums[end];
                }
                else {
                    break;
                }
            }
            
            else {
                if (l == 0){
                    l = end - start + 1;
                }
                while (start <= end && sum >= s){
                    if (end - start + 1 < l){
                        l = end - start + 1;
                    }
                    sum -= nums[start];
                    start++;
                }
            }
        }
        return l;
    }
}
