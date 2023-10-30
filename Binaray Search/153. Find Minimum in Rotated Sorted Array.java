class Solution {
    public int findMin(int[] nums) {

        int n=nums.length;
        int low=0;
        int end=n-1;

        while(low<=end)
        {
            int mid=(low+end)/2;

            int prev= (mid-1+n)%n;
            int next= (mid+1)%n;

            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]) //Case when minimum element is found
            {
                return nums[mid];
                
            }

            else if(nums[mid]>=nums[low] && nums[mid]>=nums[end])
            {   
                 low=mid+1;
            }

            else if(nums[mid]<=nums[end] )
            {
                end=mid-1;
            }
        }

        return 0;
        
    }
}
