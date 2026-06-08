class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
            }else if(nums[i]==1){
                b++;
            }else{
                c++;
            }
        }
            int idx=0;
        for(int i=0;i<a;i++){
            nums[idx++]=0;
            }
        for(int i=0;i<b;i++){
            nums[idx++]=1;
            }
        for(int i=0;i<c;i++){
            nums[idx++]=2;
        }
    }
}