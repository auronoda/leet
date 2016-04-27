public class Solution {
    public int mySqrt(int x) {
      if (x == 0){
        return 0;
      }
      else {
        int start = 1;
        int end = x;
        int mid;
        while (start + 1 < end){
          mid = start + (end - start) / 2;
          if (x / mid >= mid){
            start = mid;
          }
          else {
            end = mid;
         }
        }
        return start;
      }
    }
}
