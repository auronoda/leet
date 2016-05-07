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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curt = root;
        Stack<TreeNode> stack = new Stack();
        int count = 0;
        while (curt != null || !stack.empty()){
            while (curt != null){
                stack.push(curt);
                curt = curt.left;
                }
            curt = stack.pop();
            count++;
            if (count == k){
                return curt.val;
            }
            curt = curt.right;
        }
        return -1;
    }
}