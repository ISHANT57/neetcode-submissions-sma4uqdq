class Solution {
    public int findMin(int[] nums) {

        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return 0;
    }

    
}
