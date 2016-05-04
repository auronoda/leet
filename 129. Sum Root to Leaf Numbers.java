/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        sumNumbersHelper (root,0);
        return sum;
    }
    
    private void sumNumbersHelper(TreeNode root, int path){
        if (root != null){
            path = path * 10 + root.val;
            if(root.left == null && root.right == null){
                sum += path;
            }
            else {
                sumNumbersHelper(root.left, path);
                sumNumbersHelper(root.right, path);
            }
        }
    }
}