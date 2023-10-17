class Pair{
    public TreeNode treeNode;
    public int level;

    public Pair(TreeNode node, int lev){
        this.treeNode = node;
        this.level = lev;
    }
    
}


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();

        if(root==null){
            return finalAns;
        }

        q.add(new Pair(root, 1));

        while(!q.isEmpty()){
            Pair p = q.peek();
            q.remove();

            TreeNode node = p.treeNode;
            int level = p.level;

            if(node!=null){
                if(finalAns.size()<level){
                    finalAns.add(new ArrayList<Integer>());
                }

                finalAns.get(level-1).add(node.val);

                q.add(new Pair(node.left, level+1));
                q.add(new Pair(node.right, level+1));
            }

        }
        return finalAns;

    }
}
