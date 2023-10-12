class Solution {

    private boolean set=true;

    public void dfs(TreeNode p,TreeNode q)
    {   
        if(p!=null && q==null) // Case when p is not null & q is null
        {
            set=false;
            return;
        }
        if(p==null && q!=null) // Case when p is null & q is not null
        {
            set=false;
            return;
        }

        if(p==null && q==null) // Case when both p & q are null
        {
            return;
        }
        if(p!=null && q!=null) //Case when neither p & q are null
        {
            if(p.val!=q.val) // check is q & q values are not same
            {
            set=false;
            return;
            }
        }

        dfs(p.left,q.left);
        dfs(p.right,q.right);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {

        dfs(p,q);

        return set;
        
        
    }
}
