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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Queue<Pair> q=new LinkedList<>();

        if(root==null)
        return ans;

        if(root !=null)
        {
            q.add(new Pair(root,1));
        }

        while(!q.isEmpty())
        {
            Pair p=q.peek();
            q.remove();
            TreeNode node=p.node;
            int level=p.level;

            if(node!=null)
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

        

        int i=1;
        while(i<ans.size())
        {
            List<Integer> rev_ele=ans.get(i);
            Collections.reverse(rev_ele);


            i+=2;
        }

        return ans;
    }
}
