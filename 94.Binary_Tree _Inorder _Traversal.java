class Solution {

    private List<Integer> list=new ArrayList<Integer>();

    public void dfs(TreeNode root)
    {
        if(root==null)
        return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        
            dfs(root);
            return list;
        
    }
}
