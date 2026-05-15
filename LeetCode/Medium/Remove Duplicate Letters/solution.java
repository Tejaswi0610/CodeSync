class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())
           freq[ch-'a']++;
        boolean[] visited=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(char ch: s.toCharArray()){
            if(visited[ch-'a']){
                freq[ch-'a']--;
                continue;
            }
            while(!stack.isEmpty() && ch<stack.peek() && freq[stack.peek()-'a']>1){
                freq[stack.peek()-'a']--;
                visited[stack.pop()-'a']=false;
            }
            stack.push(ch);
            visited[ch-'a']=true;
        }
        StringBuilder result=new StringBuilder();
        for(char ch:stack){
            result.append(ch);
        }
        return result.toString();
    }
}