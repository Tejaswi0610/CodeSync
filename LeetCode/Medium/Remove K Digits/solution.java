class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> stack=new Stack<>();
        for(char ch:num.toCharArray()){
            while(!stack.isEmpty() && k>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }
        StringBuilder result =new StringBuilder();
        for(char ch:stack)
           result.append(ch);
        while(result.length() >0 && result.charAt(0)=='0')
            result.deleteCharAt(0);
        return result.length() >0 ?result.toString() :"0";
    }
}