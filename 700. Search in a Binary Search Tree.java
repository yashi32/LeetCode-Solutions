class Solution {
    
    private TreeNode ans=null;
    public void dfs(TreeNode root,int val)
    {
            if(root==null)
            return;

            if(root.val==val)
            ans=root;

            if(val<=root.val){
                dfs(root.left,val);
            }
            
            
            else{
                dfs(root.right,val);
            }
            
            
    }
     public TreeNode searchBST(TreeNode root, int val) {

        dfs(root,val);

        return ans;
        
    }
}
