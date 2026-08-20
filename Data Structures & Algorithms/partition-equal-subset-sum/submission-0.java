class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;

        int s = 0;
        for (int i : nums){
            s += i;
        }

        if (s%2 == 1) return false;

        s = s/2;

        boolean [][] dp = new boolean[n+1][s+1];

        for (int i = 0 ; i <= n ; i++){
            dp[i][0] = true;
        }

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= s ; j++){
                boolean nt = dp[i-1][j];
                boolean t = false;
                if (nums[i-1] <= j) t = dp[i-1][j - nums[i-1]];
                dp[i][j] = t || nt;
            }
        }
        
        return dp[n][s];
    }
}
