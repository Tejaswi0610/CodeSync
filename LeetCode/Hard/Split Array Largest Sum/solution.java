class Solution {
    public int splitArray(int[] nums, int k){
        int n=nums.length;
        int low=nums[0], high=0;
        for(int ele : nums){
           low=Math.max(low,ele);
           high+=ele;
        }
        int result=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(nums,k,mid)){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
    public boolean isPossible(int[] nums,int k, int mid){
        int c=1;
        int s=0;
        for(int ele:nums){
            s+=ele;
            if(s>mid){
                c+=1;
                s=ele;
            }
        }
        return c <=k;
    }
}