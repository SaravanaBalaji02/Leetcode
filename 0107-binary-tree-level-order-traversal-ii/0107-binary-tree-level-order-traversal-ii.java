class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> result=new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int s=q.size();
          
            List<Integer> list=new ArrayList<>();
             for(int i=0;i<s;i++)
             {
                TreeNode temp=q.poll();
                list.add(temp.val);
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                if(temp.right!=null)
                {
                    q.add(temp.right);
                }
             }
             result.addFirst(list);
           
        }
        return result;
    }
}