class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='+' || ch=='-' || ch=='*'){
                List<Integer> left=diffWaysToCompute(s.substring(0,i));
                List<Integer> right=diffWaysToCompute(s.substring(i+1));
                for(int a:left){
                    for(int b: right){
                        if(ch=='+'){
                            ans.add(a+b);
                        }
                        if(ch=='-'){
                            ans.add(a-b);
                        }
                        if(ch=='*'){
                            ans.add(a*b);
                        }
                    }
                }
            }
        }
        if(ans.isEmpty()){
            ans.add(Integer.parseInt(s));
        }
        return ans;
    }
}