class Solution {
    public int countValidPrefixes(String s) {
        int res=0;
        int zeros=0;
        int ones=0;
        for(char ch:s.tocharArray()){
            if(ch=='0'){
                zeros++;
            }
            else(ch=='1'){
                ones++;
            }
            
        }
    }
}