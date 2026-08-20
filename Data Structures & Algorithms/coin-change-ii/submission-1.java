class Solution {
    public int rec(int i , int j , int [] c, int [][]dp){
        if (j == 0) return dp[i][j] = 1;
        if (i == 0) return dp[i][j] = 0;
        if (dp[i][j] != -1) return dp[i][j];
        int t = 0;
        if (j >= c[i-1]) t = rec(i,j - c[i-1] , c , dp);
        int nt = rec(i-1 , j , c , dp);
        return dp[i][j] = t + nt;
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int m = amount;
        int [][] dp = new int[n+1][m+1];
        for (int i = 0 ; i <=n ; i++){
            Arrays.fill(dp[i],-1);
        }
        rec(n , m, coins , dp);
        return dp[n][m];
    }
}
