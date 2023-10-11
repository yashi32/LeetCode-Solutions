class Solution {
    private List<Integer> list=new ArrayList<Integer>();

    public void dfs(TreeNode root)
    {
            if(root==null)
            return;
            list.add(root.val);
            dfs(root.left);
            dfs(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
        dfs(root);
        return list;
    }
}
