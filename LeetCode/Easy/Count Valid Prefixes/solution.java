class Solution {
    public int countValidPrefixes(String s) {
        int res=0;
        int zeros=0;
        int ones=0;
        for(char ch:s.tocharArray()){
            if(ch=='0'){
                zeros++;
            }
            else{
                ones++;
            }        
            if(zeros==ones || zeros=ones+1 || ones=zeros+1){
                res++;
            }
        }
        return res;
    }
}