class Solution {
    public int distributeCandies(int[] candyType) {
       int ans=0;
       for(int i=0;i<candyType.length;i++){
        if(candyType.length>0){
            ans=candyType.length/2;
        }
       }
       return ans;
    }
}