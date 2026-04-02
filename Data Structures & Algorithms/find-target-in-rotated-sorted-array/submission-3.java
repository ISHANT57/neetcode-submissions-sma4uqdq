class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        if(low==high){
            return low;
        }

        while(low<high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }

            else if(nums[mid]>nums[high]){
                low=mid+1;
            }

            else if(nums[mid]<nums[high]){
                high=mid;

            }

        }
        return -1;

    }
}
