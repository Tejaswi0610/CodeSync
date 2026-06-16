class Solution {
    static boolean isPrime(int n){
        if(n<2){
        return false;
    }
    for(int i=2;i*i<=n;i++){
        if(n %i==0){
            return false;
        }
    }
    return true;
    }
    static int freq(int[] arr,int ele){
        int freq=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                freq++;
            }
        }
        return freq;
    }
    public boolean checkPrimeFrequency(int[] nums) { 
        for(int i:nums){
            int freq=freq(nums,i);
            if(isPrime(freq)==true){
                return true;
            }
        } 
        return false;
    }
}