public class Pair{
    TreeNode root;
    int level;

    Pair(TreeNode node,int level){
        this.root=node;
        this.level=level;
    }

 }
class Solution {
    public List<Integer> rightSideView(TreeNode root) {

        List<List<Integer>> ans=new ArrayList<List<Integer>>(); //List of list to store element at each level
        List<Integer> final_ans=new ArrayList<Integer>(); //Returns the right view of tree
        Queue<Pair> q=new LinkedList<>();

        if(root==null)
        return final_ans;

        if(root!=null)
        {
            q.add(new Pair(root,1));
        }

        while(!q.isEmpty()){
           
            Pair p=q.peek();
            q.remove();
            TreeNode node=p.root;
            int level=p.level;

            if(node!=null)
            {
                if(ans.size()<level)
                {
                    ans.add(new ArrayList<Integer>());
                }

                ans.get(level-1).add(node.val);
                q.add(new Pair(node.left,level+1)); //Store an object of type Pair that stores node left child along with level
                q.add(new Pair(node.right,level+1));
            }



         }

         for(int i=0;i<ans.size();i++)
         {   
             
             List<Integer> level_element=ans.get(i);
             int element=level_element.get(level_element.size()-1);
             final_ans.add(element);
             
             
         }

         return final_ans;


        
    }
}
