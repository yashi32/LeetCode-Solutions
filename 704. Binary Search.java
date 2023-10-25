class Solution {
    public int search(int[] nums, int target) {

        int n=nums.length;
        int low=0;
        int high=n-1;

        
        while(high>=low)
        {   
            int mid=(low+high)/2;
            System.out.println(mid);
            if(nums[mid]==target)
            {
               
               return mid; 
            }

            else if(nums[mid]<target)
            {
                low=mid+1;
            }

            else if(nums[mid]>target)
            {
                high=mid-1;
            }
            
        }

        return -1;
        
    }
}
