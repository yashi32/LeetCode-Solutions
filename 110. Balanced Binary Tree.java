class Solution {

    private boolean check=true;
    
    public int dfs(TreeNode root) //Height of Binary Tree
    {
        if(root==null)
        {
            return 0;
        }

        if(root.left==null && root.right==null)
        {
                return 1;
        }

        int left=dfs(root.left);
        int right=dfs(root.right);

        if(Math.abs(left-right)>1)
        {
            check=false;

        }
        return Math.max(left,right)+1;
        
        }
    public boolean isBalanced(TreeNode root) {

        int val=dfs(root);

        return check;        
    }
}
