public class Solution {
    public boolean exist(char[][] board, String word) {
        ArrayList<Integer> used = new ArrayList<Integer>();
        for (int i = 0; i < board.length; i++){
          for (int j = 0; j < board[i].length; j++){
            if (existHelper (board, word, used, i, j, 0)){
             return true;
            } 
          }
        }
       return false; 
    }
    
    private boolean existHelper (char[][] board, String word, ArrayList<Integer> used, int x, int y, int pos){
      
      if (board[x][y] == word.charAt(pos) && used.indexOf(num(board, x, y)) == -1){
        pos++;
        used.add(num(board, x, y));
        if (pos == word.length()){
          return true;
        }
         if (x > 0){
           if (existHelper (board, word, used, x - 1, y, pos)){
             return true;
           }

          }
        if (x < board.length - 1){
           if (existHelper (board, word, used, x + 1, y, pos)){
             return true;
           }

          }
        if (y > 0){
           if (existHelper (board, word, used, x, y - 1, pos)){
             return true;
           }

          }
        if (y < board[x].length - 1){
           if (existHelper (board, word, used, x, y + 1, pos)){
             return true;
           }
 
          }
        
          used.remove(used.size()-1);
          pos--;
      }
      return false;
    }
    
    private int num(char[][] board, int x, int y){
      int n = 0;
        for (int i = 0; i < x; i++){
          n += board[i].length;
        }
        n += y;
        return n;
    }
}
