class Solution {
    public int reverseBits(int n) {
        int a = 0;
        for (int i = 0 ; i < 32 ; i++){
            a = a | (n >> i & 1)<<(31-i);
        }
        return a;
    }
}
