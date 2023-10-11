class Solution {

    public int maxDepth(TreeNode root) {

        if(root==null) //If no node is found
        return 0;

        if(root.left==null && root.right==null) //If Leaf node is found
        return 1;

        int left=maxDepth(root.left); //Left Subtree Check
        int right=maxDepth(root.right); //Right Subtree Check

        return Math.max(left,right)+1; 
        //Maximum of both Left & Right Subtree along with root node position
        
    }
}
