public class Solution {
    public List<String> letterCombinations(String digits) {
      ArrayList<String> result = new ArrayList<String>();
      String list = new String();
      ArrayList<String> table = new ArrayList<String>();
      table.add("abc");
      table.add("def");
      table.add("ghi");
      table.add("jkl");
      table.add("mno");
      table.add("pqrs");
      table.add("tuv");
      table.add("wxyz");
      helper(result, list, digits, table, 0);
      return result; 
    }
    public void helper( ArrayList<String> result, String list, String digits, ArrayList<String> table, int pos){
      if (digits.length() == 0){
      return;
      }
      for (int j = 0; j < table.get(Character.getNumericValue(digits.charAt(pos))-2).length(); j++){
        list+= table.get(Character.getNumericValue(digits.charAt(pos))-2).charAt(j);
        if (list.length() == digits.length()){
          result.add(new String(list));
        }
        else {
          helper(result, list, digits, table, pos + 1);
        }
        list = list.substring(0,list.length() - 1);
      } 
    }
    
}
