/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean dfs(TreeNode root,int targetSum,int sum)
    {   
        boolean left=false;
        boolean right=false;
        boolean check = false; 
        if(root==null)
        {
            return check;
        }

        if(root!=null)
        {
            sum+=root.val;

            if(root.left==null && root.right==null)
            {
                if(sum==targetSum)
                {
                    check=true;
                    return check;
                }
            }

            left=  dfs(root.left,targetSum,sum);
            right= dfs(root.right,targetSum,sum);
        }

        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {

        boolean ans=dfs(root,targetSum,0);
        return ans;
        
    }
}
