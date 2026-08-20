class Solution {
    public int hammingWeight(int n) {
        int c = 0;
        for (int i = 0 ; i < 32 ; i++){
            c = c + (n>>i&1); 
        }
        return c;
    }
}
