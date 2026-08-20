class Solution {
    public int getSum(int a, int b) {
        int c = 0;
        int s = 0;
        int ans = 0;

        for (int i = 0 ; i < 32 ; i++){
            int a2 = a >> i & 1;
            int b2 = b >> i & 1;

            s = a2 ^ b2 ^ c;
            ans = ans | s<<i;
            c = (a2 & b2 ) | (c & b2 ) | (a2 & c ) ;
        }
        return ans;
    }
}
