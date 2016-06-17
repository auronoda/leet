public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return 0;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        int[] heights = new int[m + 1];
        int maxarea = 0;
        for (int i = 0; i < n; i++){
            
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == '1'){
                    heights[j]++;
                }
                else{
                   heights[j] = 0;
                }
            }
            maxarea = Math.max(maxarea, area(heights));
        }
        return maxarea;
    }
    
    private int area(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for (int i = 0; i < heights.length; i++){
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                int top = stack.pop();
                int width = stack.isEmpty()? i: i - stack.peek() - 1;
                max = Math.max(max, heights[top] * width);
            }
            stack.push(i);
        }
        return max;
    }
}