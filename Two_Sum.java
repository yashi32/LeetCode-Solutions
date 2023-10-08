class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int x=target-nums[i];

            // case when solution is found

            if (map.containsKey(x) &&  map.get(x) !=i ) 
            {
                    return new int[]{map.get(x),i};
            }

            map.put(nums[i],i);
        }

        //In case no solution is found return null

        return null;
        
    }
}
