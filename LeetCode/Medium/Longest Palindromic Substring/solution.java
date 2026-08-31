class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==rev.charAt(i)){
                ans=ans+s.charAt(i);
            }else{
                if(ans.length()>0){
                    return ans;
                }
            }
        }
        return ans;
    }
}