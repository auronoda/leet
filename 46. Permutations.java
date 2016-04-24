public class Solution {
    public List<List<Integer>> permute(int[] nums) {
      ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
      ArrayList<Integer> list = new ArrayList<Integer>();
      ArrayList<Integer> used = new ArrayList<Integer>();
      permuteHelper(result, list, nums, used);
      return result;
    }
    
    private void permuteHelper (ArrayList<List<Integer>> result, ArrayList<Integer> list, int [] nums, ArrayList<Integer> used){
      if (list.size() == nums.length){
        result.add(new ArrayList<Integer>(list));
      }
      
      else {
        for (int i = 0; i < nums.length; i++){
          if (used.indexOf(i) == -1){
            list.add(nums[i]);
            used.add(i);
            permuteHelper(result, list, nums, used);
            list.remove(list.size()-1);
            used.remove(used.size()-1);
          } 
        }
      }
    }
}
