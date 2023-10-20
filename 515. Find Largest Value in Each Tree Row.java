public class Pair{

     TreeNode node;
     int level;
     Pair(TreeNode node,int level) // Structure for storing pair values of tree node and level at which node present
     {
         this.node=node;
         this.level=level;
     }
 }
class Solution {
    public List<Integer> largestValues(TreeNode root) {

        Queue<Pair> q=new LinkedList<>();
        List<Integer> max_level=new ArrayList<Integer>(); // max element at each level
        List<List<Integer>> level_element=new ArrayList<List<Integer>>(); //elements at each level of tree 

        if(root==null)
        return max_level;

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

            if(node!=null)
            {
            if(level_element.size()<level)
            {
                level_element.add(new ArrayList<Integer>());
            }
            
            level_element.get(level-1).add(node.val);
            q.add(new Pair(node.left,level+1));
            q.add(new Pair(node.right,level+1));

            }
        }

        for(int i=0;i<level_element.size();i++)
        {
            List<Integer> list=level_element.get(i);
            int max_num=Collections.max(list);
            max_level.add(max_num);
        }

        return max_level;


        
    }
}
