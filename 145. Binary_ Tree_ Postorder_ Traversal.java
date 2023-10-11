lass Solution {
    private List<Integer> list= new ArrayList<Integer>();

    public void dfs(TreeNode root){

        if(root==null)
        return;
        dfs(root.left);
        dfs(root.right);
        list.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        
            dfs(root);
            return list;
    }
}
