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
    public boolean isValidBST(TreeNode root) {
        NodeHelper node = isValidBSTHelper(root);
        return node.BST;
    }
    
    private class NodeHelper{
        boolean BST;
        long min;
        long max;
        NodeHelper(boolean BST, long i, long j){
            this.BST = BST;
            min = i; 
            max = j;
        }
    }
    
    private NodeHelper isValidBSTHelper(TreeNode root){
        if (root == null){
            return new NodeHelper(true, Long.MAX_VALUE, Long.MIN_VALUE);
        }
        else {
            NodeHelper templ = isValidBSTHelper(root.left);
            NodeHelper tempr = isValidBSTHelper(root.right);
            long min = Math.min(root.val, templ.min);
            min = Math.min(min, tempr.min);
            long max = Math.max(root.val, templ.max);
            max = Math.max(max, tempr.max);
            return new NodeHelper ((templ.BST && tempr.BST) && (root.val > templ.max) && (root.val < tempr.min), min, max);
        }
    }
}