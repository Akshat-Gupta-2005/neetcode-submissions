class Solution {
    public int cu(int x){
        int c = 0;
        for (int i = 0 ; i < 32 ; i++){
            c = c+ (x>>i &1);
        }
        return c;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for (int i = 0 ; i <= n ; i++){
            ans[i] = cu(i);
        }

        return ans;

    }
}
