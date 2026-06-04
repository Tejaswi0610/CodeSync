class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        int product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            if(product>max){
                max=product;
            }
            if(product<0){
                product=0;
            }
        }
        return max;
    }
}