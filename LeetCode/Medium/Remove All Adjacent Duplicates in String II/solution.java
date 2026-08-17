class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            stack.push(ch);
            if(stack.size()>=k){
                Stack<Character> temp =new Stack<>();
                boolean same =true;
                for(int j=0;j<k;j++){
                    char peek=stack.pop();
                    temp.push(peek);
                    if(peek!=ch){
                        same=false;
                    }
                }
                if(!same){
                    while(!temp.isEmpty()){
                        stack.push(temp.pop());
                    }
                }
            }
        }
        String res="";
        for(char ch:stack){
            res+=ch;
        }
    
        return res.toString();
    }
}