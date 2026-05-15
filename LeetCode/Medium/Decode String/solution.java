class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack=new Stack<>();
        Stack<StringBuilder> stack =new Stack<>();
        int num=0;
        StringBuilder curr=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                num=num*10+(ch-'0');
            }else if(ch>='a'&&ch<='z'){
                curr.append(ch);
            }else if(ch=='['){
                numStack.push(num);
                stack.push(curr);
                num=0;
                curr=new StringBuilder();
            }else{
                int k=numStack.pop();
                StringBuilder temp=new StringBuilder();
                for(int i=0;i<k;i++){
                    temp.append(curr);
                }
                curr=stack.pop().append(temp);
            }
        }
        return curr.toString();
    }
}