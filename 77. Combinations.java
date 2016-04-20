public class Solution {
    public List<List<Integer>> combine(int n, int k) {
      ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
      ArrayList<Integer> list = new ArrayList<Integer>();
      combineHelper(result, list, n, k, 1);
      return result;
        
    }
    
    public void combineHelper(ArrayList<List<Integer>> result, ArrayList<Integer> list, int n, int k, int pos) {
      for (int i = pos; i <= n; i++){
        if(list.size() < k){
          list.add(i);
          if(list.size() == k){
            result.add(new ArrayList<Integer>(list));
          }
          combineHelper(result, list, n, k, i+1);
          list.remove(list.size() - 1);
        }
      }  
    }
}
