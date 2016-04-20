public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
       ArrayList<Integer> list = new ArrayList<Integer>();
       Arrays.sort(candidates);
       combinationSumhelper(result, list, candidates, target, 0, 0);
       return result;  
    }
     public void combinationSumhelper( ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] candidates, int target, int pos, int sum) {
       for (int i = pos; i < candidates.length; i++){
         list.add(candidates[i]);
         sum += candidates[i];
         
         if (sum == target){
           result.add(new ArrayList<Integer>(list)); 
         }
         else if (sum < target){
           combinationSumhelper(result, list, candidates, target, i, sum);
         }
         sum -= list.get(list.size()-1);
         list.remove(list.size()-1);
       } 
    }
    
}


