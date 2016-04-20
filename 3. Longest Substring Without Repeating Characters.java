public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int end = 0;
        int max = 0;
        ArrayList<Character> list = new ArrayList<Character>();
        while (end < s.length()){
          if (list.indexOf(s.charAt(end)) == -1){
            list.add(s.charAt(end));
            end++;
            if (list.size() > max){
              max = list.size();
            }
          }
          else {
            list.remove(0);
          }
        }
        return max;
    }
}
