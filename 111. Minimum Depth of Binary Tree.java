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
    public int minDepth(TreeNode root) {
        
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        else {
            int dleft;
            int dright;
            if (root.left == null){
                dleft = Integer.MAX_VALUE;
            }
            else {
                dleft = minDepth(root.left);
            }
            if (root.right == null){
                dright = Integer.MAX_VALUE;
            }
            else {
                dright = minDepth(root.right);
            }
            return Math.min(dleft, dright) + 1;
        }
    }
}