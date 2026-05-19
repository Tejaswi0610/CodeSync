/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder result=new StringBuilder();
        dfs(root,result);
        return result.toString();
    }
    pubilc void dfs(TreeNode root,StringBuilder result){
        if(root==null){
            result.append("null");
            return;
        }
        result.append(root.val);
        result.append(",");
        dfs(root.left,result);
        dfs(root.right,result);
    }
    int index=0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr=data.split(",");
        return buildTree(arr);
    }
    public TreeNode buildTree(String[] arr){
        if(arr[index].equals("null")){
            index+=1;
            return null;
        }
        int val=Integer.parseInt(arr[index]);
        index++;
        TreeNode newNode=new TreeNode(val);
        newNode.left=buildTree(arr);
        newNode.right=buildTree(arr);
        return newNode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));