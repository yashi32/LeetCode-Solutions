class Solution {
    public int missingNumber(int[] nums) {

        int sum_nums=0;
        for(int i=0;i<nums.length;i++)
        {
            sum_nums+=nums[i];
        }

        int n=nums.length;
        int sum_of_natural_nums= (n*(n+1))/2;  //Sum of n natural numbers

        int diff=sum_of_natural_nums-sum_nums;

        if(diff==0)
        return 0;

        return diff;

    }
}
