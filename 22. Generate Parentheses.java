

public class Solution {
    public List<String> generateParenthesis(int n) {
       ArrayList<String> result = new ArrayList<String>();
       String list = new String();
       helper(result, list, n, 0, 0);
       return result; 
    }
    
    public void helper( ArrayList<String> result, String list, int n, int left, int right) {
      if (right == n){
        result.add(list);
      }
      
      if(left < n){
        list += "(";
         helper(result, list, n, left + 1 , right);
         list = list.substring(0,list.length()-1);
      } 
      
      if (right < left){
        list += ")";
         helper(result, list, n, left , right + 1);
         list = list.substring(0,list.length()-1);
      }
       
    }
    
}
