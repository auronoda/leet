public class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] Match = new boolean[s.length() + 1][p.length() + 1];
        Match[0][0] = true;
        for (int i = 1; i <= s.length(); i++){
            Match[i][0] = false;
        }
        for (int i = 1; i <= p.length(); i++){
            char temp = p.charAt(i - 1);
            Match[0][i] = Match[0][i - 1] == true && temp == '*';
        }
        for (int i = 1; i <= s.length(); i++){
            for (int j = 1; j <= p.length(); j++){
                 char tempp = p.charAt(j - 1);
                if (tempp == '*'){
                    Match[i][j] = Match[i - 1][j] || Match[i][j - 1];
                }
                else {
                    char temps = s.charAt(i - 1);
                    Match[i][j] = Match[i - 1][j - 1] && (tempp == '?' || temps == tempp) ;
                }
            }
        }
        return Match[s.length()][p.length()];
    }
}