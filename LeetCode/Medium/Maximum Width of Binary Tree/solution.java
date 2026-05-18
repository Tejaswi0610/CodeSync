/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        TreeNode node;
        int index;
        Pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue=new LinkedList<Pair>();
        queue.add(new Pair(root,0));
        int maxWidth=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            int start=0,end=0;
            for(int i=0;i<size;i++){
                Pair curr=queue.poll();
                TreeNode node=curr.node;
                int index=curr.index;
                if(i==0) start=index;
                if(i==size-1) end=index;
                if(node.left!=null) 
                   queue.add(new Pair(node.left,2*index+1));
                if(node.right!=null)
                   queue.add(new Pair(node.right,2*index+2));
            }
            maxWidth=Math.max(maxWidth,end-start+1);
        }
        return maxWidth;
    }
}