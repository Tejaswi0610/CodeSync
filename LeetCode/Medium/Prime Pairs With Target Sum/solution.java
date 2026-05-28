class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>>result=new ArrayList<List<Integer>>();
        boolean[] primes=new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;
        for(int i=2;i*i<=n;i++){
            if(primes[i]){
                for(int j=i*i;j<=n;j+=i){
                    primes[j]=false;
                }
            }
        }
        for(int i=2;i<=n/2;i++){
            if(primes[i] && primes[n-i]){
                List<Integer> current=new ArrayList<Integer>();
                current.add(i);
                current.add(n-i);
                result.add(current);
            }
        }
        return result;
    }
}
