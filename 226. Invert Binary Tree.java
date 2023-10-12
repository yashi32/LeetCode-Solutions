class Solution {

    private TreeNode x;
    public void dfs(TreeNode root)
    {
        if(root==null)
        return;

        if(root!=null)
        {
            x=root.left;
            root.left=root.right;  // Swap the left and right pointers
            root.right=x;
        }

        dfs(root.left);
        dfs(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        
        dfs(root);
        return root;
        
    }
}
