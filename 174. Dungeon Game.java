public class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] lifes = new int[m][n];
        lifes [m -1][n - 1]= Math.max(1, 1 - dungeon[m - 1][n - 1]);
        for (int i = m - 2; i >= 0; i--){
            lifes [i][n - 1] = Math.max(1, lifes[i + 1][n - 1] - dungeon[i][n - 1]);
        }
        for (int i = n - 2; i >= 0; i--){
            lifes [m - 1][i] = Math.max(1, lifes[m - 1][i + 1] - dungeon[m - 1][i]);
        }
        for (int i = m - 2; i >= 0; i--){
            for (int j = n - 2; j >= 0; j--){
                lifes[i][j] = Math.max(1,Math.min(lifes[i + 1][j], lifes[i][j + 1]) - dungeon[i][j]);
            }
        }
        return lifes[0][0];
        
    }
}