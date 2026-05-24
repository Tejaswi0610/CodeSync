class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int num:nums){
            if(num==0)
                total++;
        }
        int ans=0;
        for(int i=0;i<n-total;i++){
            if(nums[i]==0){
                ans++;
            }
        }
        return ans;
    }
}