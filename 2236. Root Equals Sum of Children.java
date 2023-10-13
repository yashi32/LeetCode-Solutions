class Solution {
    public boolean checkTree(TreeNode root) {

        boolean check =true;

        if(root.left.val+root.right.val != root.val)
        {
            check=false;
        }

        return check;
        
    }
}
