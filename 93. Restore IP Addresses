public class Solution {
    public List<String> restoreIpAddresses(String s) {
      ArrayList result = new  ArrayList<String>();
      ArrayList list = new  ArrayList<String>();
      restoreIpAddressesHelper(result, list, s, 0);
      return result;
    }
    
    public void restoreIpAddressesHelper(ArrayList<String> result, ArrayList<String> list, String s, int pos) {
    
      if (list.size()<4){
        for (int i = 1; (i <= 3) && (pos + i <= s.length()); i++){
          list.add(s.substring(pos, pos + i));
          restoreIpAddressesHelper(result, list, s, pos + i);
          list.remove(list.size() - 1);
        }
      }
      
      else if ((list.size() == 4) && (pos == s.length())){
        String s2 = new String();
        int count = 0;
        int j  = Integer.parseInt(list.get(0));
        if ((j <= 255) && !((list.get(0).length() > 1) && (Integer.parseInt(list.get(0).substring(0,1)) == 0))){
          s2 = list.get(0);
          count++;
          for (int i = 1; i < 4; i++){
           j = Integer.parseInt(list.get(i));
           if ((j <= 255) && !((list.get(i).length() > 1) && (Integer.parseInt(list.get(i).substring(0,1)) == 0))){
             s2 = s2 + "." + list.get(i);
             count++;
            }
         }  
       }
       if (count == 4){
         result.add(s2);
       }
      }
    }
}
