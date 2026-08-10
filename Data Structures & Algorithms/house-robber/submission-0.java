class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int p2 = nums[0];
        int p1 = Math.max(nums[0], nums[1]);
        int c = 0;
        for (int i = 2 ; i < n ; i++){
            c = Math.max(p2 + nums[i] , p1 );
            p2 = p1;
            p1 = c;
        }

        return c;
    }
}
