class Solution {
    public void rotate(int[] nums, int k) {
        int left=0;
        int right=nums.length-1;
        k=k%nums.length;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        left=0;
        right=k-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left ++;
            right--;
        }
        left=k;
        right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left ++;
            right--;
        }
    }
}
// public void rotate(int []nums,int k){
//     k=k%nums.length;
//     reverse(nums,0num.length);
//     reverse(nums,0,k-1);
//     reverse(nums,k,nums.length);

// }