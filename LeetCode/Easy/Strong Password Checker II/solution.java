class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(i>0 && ch==password.charAt(i-1)) return false;
            if(ch>='a'&&ch<='z'){
                count1=1;
            }
            if(ch>='A'&& ch<='Z'){
                count2=1;
            }
            if(ch>='0'&& ch<='9'){
                count4=1;
            }
            if(ch=='!'|| ch=='@'|| ch=='#'|| ch=='$'|| ch=='%'||ch=='^'||ch=='&'|| ch=='*'||ch=='('|| ch==')' || ch=='+' || ch=='-'){
                count3=1;
            }
        }
            if(count1==1 && count2==1 && count3==1 && count4==1){
            return true;
            }
        return false;
    }
}