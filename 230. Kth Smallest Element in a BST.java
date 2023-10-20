class Solution {
    private ArrayList<Integer> ans=new ArrayList<Integer>();
    
    public void dfs(TreeNode root)
    {
        if(root==null)
        return;

        if(root!=null)
        {
            dfs(root.left);
            ans.add(root.val);
            dfs(root.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        
        dfs(root); //Inorder Traversal -->This trversal arranges element in increasing order
        return ans.get(k-1);

    }
}
