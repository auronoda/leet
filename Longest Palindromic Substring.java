public class Solution {
    /**
     * @param s input string
     * @return the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() ==0){
            return null;
        }
        int max = 0;
        int mstart = 0;
        int mend = 0;
        boolean[][] pal = new boolean[s.length()][s.length()];
        pal[0][0] = true;
        for (int end = 1; end <s.length(); end++){
            for (int start = 0; start < end; start ++){
                if (s.charAt(start) == s.charAt(end) && (end - start <= 2 || pal[start + 1][end - 1])){
                    pal[start][end] = true;
                    if (end - start > max){
                        max = end - start;
                        mstart = start;
                        mend = end;
                    }
                }
            }
        }
        return s.substring(mstart, mend +1);
    }
}