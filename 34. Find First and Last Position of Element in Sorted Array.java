class Solution {
    public int[] searchRange(int[] nums, int target) {

        //First Occurence of element

        int n=nums.length;
        int low=0;
        int high=n-1;
        int first_occ=-1;

        while(high>=low)

        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                first_occ=mid;
                high=mid-1;  

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

        // Last Occurence of elemnet

        low=0;
        high=n-1;
        int last_occ=-1;

        while(high>=low)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                last_occ=mid;
                low=mid+1;
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

        return new int[]{first_occ,last_occ};
        
    }
}
