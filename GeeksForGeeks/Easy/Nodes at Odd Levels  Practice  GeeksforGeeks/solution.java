/*
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public ArrayList<Integer> nodesAtOddLevels(Node root) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        Queue<Node> que=new LinkedList<>();
        
        que.add(root);
        int level=1;
        while(!que.isEmpty()){
            int n=que.size();
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node cur=que.poll();
                if(cur.left!=null){
                    que.add(cur.left);
                }
                if(cur.right!=null){
                    que.add(cur.right);
                }
                if(level%2!=0){
                    res.add(cur.data);
                }
            }
            
            level++;
        }
        
        return res;
    }
}