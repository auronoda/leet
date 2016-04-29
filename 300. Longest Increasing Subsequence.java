public class Solution {
    public int lengthOfLIS(int[] nums) {
      
      int[] lis = new int[nums.length];
      int max = 0;
      for (int i = 0; i < nums.length; i++){
        lis[i] = 1;
        for (int j = 0; j < i; j++){
          if ((nums[i] > nums[j]) && (lis[i] < lis[j] + 1)){
            lis[i] = lis[j] + 1;
          }
        }
        if (lis[i] > max){
        max = lis[i];
        }
      }
      return max;
    }
}
