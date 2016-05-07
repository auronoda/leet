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
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        
        else {
            TreeNode tem = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tem);
        }
        return root;
    }
}