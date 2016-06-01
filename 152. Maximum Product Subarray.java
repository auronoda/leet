public class Solution {
    public int maxProduct(int[] nums) {
        int[][] products = new int[nums.length][2];
        products [0][0] = nums[0];
        products [0][1] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > 0){
                products[i][0] = Math.max(products[i - 1][0] * nums[i], nums[i]);
                products[i][1] = Math.min(products[i - 1][1] * nums[i], nums[i]);
            }
            else {
                products[i][0] = Math.max(products[i - 1][1] * nums[i], nums[i]);
                products[i][1] = Math.min(products[i - 1][0] * nums[i], nums[i]);
            }
            max = Math.max(max, products[i][0]);
            
        }
        return max;
    }
}