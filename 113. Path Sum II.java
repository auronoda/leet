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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
         ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
         ArrayList<Integer> list = new ArrayList<Integer>();
         pathSumHelper(root, sum, result, list);
         return result;
    }
    
    private void pathSumHelper(TreeNode root, int sum,ArrayList<List<Integer>> result, ArrayList<Integer> list){
        if (root != null){
            list.add(root.val);
            if (root.left == null && root.right == null && root.val == sum){
                result.add(new ArrayList<Integer>(list));
            }
            pathSumHelper(root.left, sum - root.val, result, list);
            pathSumHelper(root.right, sum - root.val, result, list);
            list.remove(list.size() - 1);
        }
        

    }
}