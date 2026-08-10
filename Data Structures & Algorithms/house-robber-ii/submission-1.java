class Solution {
    public int f(int[] nums, int l , int r) {
        int n = r - l + 1;
        if (n == 1) return nums[l];
        if (n == 2) return Math.max(nums[l], nums[l+1]);

        int p2 = nums[l];
        int p1 = Math.max(nums[l], nums[l+1]);
        int c = 0;
        for (int i = l+2 ; i <= r ; i++){
            c = Math.max(p2 + nums[i] , p1 );
            p2 = p1;
            p1 = c;
        }

        return c;
    }

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        return (Math.max(f(nums,0,nums.length-2) , f(nums,1,nums.length-1)));
    }
}
