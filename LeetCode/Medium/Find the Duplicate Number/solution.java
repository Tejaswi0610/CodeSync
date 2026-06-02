class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1] && nums[i+1]<nums.length){
                ans=nums[i];
            }
        }
        return nums[i];
    }
}