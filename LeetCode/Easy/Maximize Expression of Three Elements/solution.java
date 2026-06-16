class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int smallest = nums[0];
        int largest = nums[n - 1];
        int secondLargest = nums[n - 2];
        
        return largest + secondLargest - smallest;
    }
}
