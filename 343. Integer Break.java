public class Solution {
    public int integerBreak(int n) {
        int[] products = new int[n];
        products[0] = 1;
        for (int i = 2; i <= n; i++){
            for (int j = 1; j <= i / 2; j++){
                int temp = Math.max(products[j - 1],j) * Math.max(products[i - j - 1],i - j);
                if (temp > products[i - 1]){
                    products[i - 1] = temp;
                }
            }
        }
        return products[n - 1];
    }
}