class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        if(low==high){
            if(nums[low]==target){
                return low;

            }
            
        }

        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if ( nums[low]<=nums[mid]){
                if(target>=nums[low] && target<nums[mid]){
                    high=mid-1;
                }

                else{
                    low=mid+1;
                    
                }
            }

            else if ( nums[high]>=nums[mid]){
                if(target<=nums[high] && target>nums[mid]){
                    low=mid+1;
                }

                else{
                    high=mid-1;
                }
            }

        }
        return -1;

    }
}
