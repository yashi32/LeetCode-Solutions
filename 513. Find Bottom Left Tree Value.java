 public class Pair{
     TreeNode node;
     int level;
     Pair(TreeNode node,int level)
     {  
         this.node=node;
         this.level=level;
     }
 }
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<Pair> q=new LinkedList<>();
        int leftmost_val;

        if(root==null)
        leftmost_val=0;

        if(root!=null)
        {
            q.add(new Pair(root,1));
        }

        while(!q.isEmpty())
        {
            Pair p=q.peek();
            q.remove();
            TreeNode node=p.node;
            int level=p.level;

            if(node!= null)
            {
                if(ans.size()<level)
                {
                    ans.add(new ArrayList<Integer>());
                }
                ans.get(level-1).add(node.val);
                q.add(new Pair(node.left,level+1));
                q.add(new Pair(node.right,level+1));

            }


        }

        int n= ans.size()-1;
        List<Integer> l=ans.get(n);
        leftmost_val=l.get(0);

        return leftmost_val;



        
    }
}
