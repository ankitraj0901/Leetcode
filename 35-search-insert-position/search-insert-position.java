class Solution {
    public static int searchInsert(int[] nums, int target) {
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target)
                return i;
            else if(nums[i]>target) 
                return i;
        }
        return i;
    }
}