class Solution {
    int lowerBound(int[] arr, int target) {
        int n=arr.length;
        int result=n;
        int low=0 ,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target<=arr[mid]){
                result=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
}
