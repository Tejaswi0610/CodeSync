class Solution {
    public long sumAndMultiply(int n) {
        int temp=n;
        int res=0;
        long mul=1;
        long result=0;
        long sum=0;
        while(temp!=0){
            int rem=temp%10;
            if(rem!=0){
                res+=rem*mul;
                mul*=10;
            }
            sum+=rem;
            temp/=10;
        }
        result = res*sum;
        return result;        
    }
}