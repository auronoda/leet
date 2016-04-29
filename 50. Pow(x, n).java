public class Solution {
    public double myPow(double x, int n) {
      if (n == 1){
        return x;
      }
      else if (n == 0){
        return 1;
      }
      
      else if (n == -1){
        return 1/x;
      } 
      else {
         if (n % 2 == 0){
          double a =  myPow(x, n / 2);
          return a * a;
         }
         else {
          double a = myPow(x, (n - 1) / 2);
          return a * a * x;
         }
      }
    }
}
