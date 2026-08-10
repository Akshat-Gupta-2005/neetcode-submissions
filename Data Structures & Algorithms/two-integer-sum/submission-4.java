class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0 ,  r = nums.length-1;
        // Arrays.sort(nums);
        // while(l<=r){
        //     if (nums[l] + nums[r] == target) return new int[]{l,r};
        //     else if (nums[l] + nums[r] > target) r--;
        //     else l++;
        // }

        Map <Integer , Integer> hm = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if ( hm.containsKey(target - nums[i])){
                return new int[]{hm.get(target - nums[i]) , i};
            }
            hm.put(nums[i] , i);
        }

        return new int[]{-1,-1};



    }
}
