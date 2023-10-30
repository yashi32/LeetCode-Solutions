class Solution {

    public int min_element_index(int[]nums)
    {   
        int n=nums.length;
        int low=0;
        int high=n-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;


            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next])
            {
                return mid;
            }

            else if(nums[mid]>=nums[low] && nums[mid]>=nums[high])
            {
                low=mid+1;
            }

            else if(nums[mid]<=nums[high])
            {
                high=mid-1;
            }
        }
        return 0;

    }
    public int binary_search(int start,int end,int[]nums,int target)
    {
        int low=start;
        int high=end;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(nums[mid]==target)
            {
                return mid;
            }

            else if(nums[mid]<=target)
            {
                low=mid+1;
            }

            else if(nums[mid]>=target)
            {
                high=mid-1;
            }
        }
        return -1;
    }

    public int search(int[] nums, int target){

        int n=nums.length;
        int index=min_element_index(nums);
        int ans1=binary_search(0,index-1,nums,target); //Checks the left sorted array
        int ans2=binary_search(index,n-1,nums,target);//Checks the right sorted array

        System.out.println(index);
        System.out.println(ans1);
        System.out.println(ans2);

        
        if(ans1>=ans2)
        {
            return ans1;
        }
        else
        {
            return ans2;
        }






        
    }
}
