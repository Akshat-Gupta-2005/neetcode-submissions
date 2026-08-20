class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        int n = nums.length;
        for (int i = 0 ; i < x ; i++){
            n = n ^ i ^ nums[i];
        }

        return n;
    }
}
