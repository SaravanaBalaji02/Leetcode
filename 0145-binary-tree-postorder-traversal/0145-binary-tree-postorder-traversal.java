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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        post(root,list);
        return list;
    }
    public void post(TreeNode root,List<Integer> list)
    {
        TreeNode node=root;
        if(node == null)
        {
            return;
        }
        post(root.left,list);
        post(root.right,list);
        list.add(root.val);
    }
}