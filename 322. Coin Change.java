public class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0){
            return 0;
        }
        int[] nums = new int[amount + 1];
        nums[0] = 0;
        for (int i = 1; i <= amount; i++){
            nums[i] = Integer.MAX_VALUE;
            for (int j: coins){
                if (i - j >= 0 && nums[i -j] != Integer.MAX_VALUE){
                    nums[i] = Math.min(nums[i - j] + 1, nums[i]);
                } 
            }
        }
        if (nums[amount] == Integer.MAX_VALUE){
            return -1;
        }
        return nums[amount];
    }
   
    
}