public class Solution {
    public String intToRoman(int num) {
        String Roman = new String();
        
        Roman = intToRomanHelper(num, Roman);
        return Roman;
    }
    
    public String intToRomanHelper(int num, String Roman) {
      if (num / 1000 != 0){
        Roman = Roman + "M";
        Roman = intToRomanHelper(num - 1000, Roman);
      }
      
      else if (num / 900 != 0){
        Roman = Roman + "CM";
        Roman = intToRomanHelper(num - 900, Roman);
      }
      
      else if (num / 500 != 0){
        Roman = Roman + "D";
        Roman = intToRomanHelper(num - 500, Roman);
      }
      
      else if (num / 400 != 0){
        Roman = Roman + "CD";
        Roman = intToRomanHelper(num - 400, Roman);
      }
      
      else if (num / 100 != 0){
        Roman = Roman + "C";
        Roman = intToRomanHelper(num - 100, Roman);
      }
      
      else if (num / 90 != 0){
        Roman = Roman + "XC";
        Roman = intToRomanHelper(num - 90, Roman);
      }
      
      else if (num / 50 != 0){
        Roman = Roman + "L";
        Roman = intToRomanHelper(num - 50, Roman);
      }
      
      else if (num / 40 != 0){
        Roman = Roman + "XL";
        Roman = intToRomanHelper(num - 40, Roman);
      }
      
      else if (num / 10 != 0){
        Roman = Roman + "X";
        Roman = intToRomanHelper(num - 10, Roman);
      }
      
      else if (num / 9 != 0){
        Roman = Roman + "IX";
        Roman = intToRomanHelper(num-9, Roman);
      }
      
      else if (num / 5 != 0){
        Roman = Roman + "V";
        Roman = intToRomanHelper(num - 5, Roman);
      }
      
      else if (num / 4 != 0){
        Roman = Roman + "IV";
        Roman = intToRomanHelper(num - 4, Roman);
      }
      
      else if (num / 1 != 0){
        Roman = Roman + "I";
        Roman = intToRomanHelper(num - 1, Roman);
      }
    
    return Roman;
    }
    
}
