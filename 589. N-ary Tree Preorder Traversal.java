class Solution {
    private List<Integer> ans=new ArrayList<Integer>();
    public void dfs(Node root)
    {   
        if(root!=null)
        {
            ans.add(root.val);
            int n=root.children.size()-1;
            for(int i=0;i<=n;i++)
            {
                dfs(root.children.get(i));
            }
        }

        
    }

    public List<Integer> preorder(Node root) {
        
        dfs(root);
        return ans;
        
    }
}
