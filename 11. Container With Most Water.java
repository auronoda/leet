public class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Math.min(height[start], height[end]) * (end - start);
        while (end > start){
            if (height[start] > height[end]){
                end--;
                max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            }
            else {
                start++;
                max = Math.max(max, Math.min(height[start], height[end]) * (end - start));
            }
        }
        return max;
    }
}