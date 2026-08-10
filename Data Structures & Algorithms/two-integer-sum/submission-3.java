class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0 ,  r = nums.length-1;
        // Arrays.sort(nums);
        // while(l<=r){
        //     if (nums[l] + nums[r] == target) return new int[]{l,r};
        //     else if (nums[l] + nums[r] > target) r--;
        //     else l++;
        // }

        for (int i = 0 ; i < nums.length - 1; i++){
            for (int j = i+1 ; j<nums.length ; j++){
                if (nums[i] + nums[j] == target) return new int[]{i,j};
            }
        }



        return new int[]{-1,-1};
    }
}
