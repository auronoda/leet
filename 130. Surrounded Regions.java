public class Solution {
    public void solve(char[][] board) {
    if (board == null || board.length == 0 || board[0].length == 0){
        return;
    }
    int m = board.length;
    int n = board[0].length;
    Queue<Integer> queue = new LinkedList();
    for (int i = 0; i < n; i++){
        if (board[0][i] == 'O'){
            board[0][i] = 'L';
            queue.add(i);
        }
        if (board[m - 1][i] == 'O'){
            board[m - 1][i] = 'L';
            queue.add((m - 1) * n + i);
        }
    }
    for (int i = 0; i < m; i++){
        if (board[i][0] == 'O'){
            board[i][0] = 'L';
            queue.add(i * n);
        }
        if (board[i][n - 1] == 'O'){
            board[i][n - 1] = 'L';
            queue.add(i * n + n - 1);
        }
    }
      
    while(!queue.isEmpty()){
        int current = queue.poll();
        int i = current / n;
        int j = current % n;
        if(i - 1 >= 0 && board[i - 1][j] == 'O'){
            queue.add((i - 1) * n + j);
            board[i - 1][j] = 'L';
        } 
        if(i + 1 < m && board[i + 1][j] == 'O'){
            queue.add((i + 1) * n + j);
            board[i + 1][j] = 'L';
        }
        if(j - 1 >= 0 && board[i][j - 1] == 'O'){
            queue.add(i * n + j - 1);
            board[i][j - 1] = 'L';
        }
        if(j + 1 < n && board[i][j + 1] == 'O'){
            queue.add(i * n + j + 1);
            board[i][j + 1] = 'L';
        }
    }
      
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            if (board[i][j] == 'L'){
                board[i][j] = 'O';
            }
            else if (board[i][j] == 'O'){
                board[i][j] = 'X';
            }
        }
    }
    }
}