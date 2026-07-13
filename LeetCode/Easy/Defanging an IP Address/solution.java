class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='.'){
        //         ans+="[.]";
        //     }else{
        //         ans+=s.charAt(i);
        //     }
        // }
        // return ans;
    }
}
