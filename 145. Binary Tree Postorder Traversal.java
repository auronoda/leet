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
    private class TreeNodeHelper {
        TreeNode node;
        boolean visited;
        TreeNodeHelper (TreeNode node){
            this.node = node;
            visited = false;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNodeHelper> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        TreeNode curt = root;
        while (curt != null || !stack.empty()){
            while (curt != null){
                TreeNodeHelper curthelper = new TreeNodeHelper(curt);
                stack.push(curthelper);
                curt = curt.left;
            }
            
            TreeNodeHelper curthelper = stack.pop();
            if (curthelper.visited == false){
                curthelper.visited= true;
                curt = curthelper.node.right;
                stack.push(curthelper);
            }
            else {
                result.add(curthelper.node.val);
            }
        }
        
        return result;
    }
}