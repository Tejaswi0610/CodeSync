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
    public boolean isTreeSymmetric(TreeNode leftroot, TreeNode rightroot) {
        if(leftroot==null && rightroot==null){
            return true;
        } 
        if(leftroot==null && rightroot!=null || leftroot!=null && rightroot==null){
            return false;
        }
        if(leftroot.val!=rightroot.val){
            return false;
        }
        return isTreeSymmetric(leftroot.left,rightroot.right) && isTreeSymmetric(leftroot.right,rightroot.left);
    }
    public boolean isSymmetric(TreeNode root){
        return isTreeSymmetric(root.left,root.right);
    }
}