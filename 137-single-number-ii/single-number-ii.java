class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for(i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1])
                i=i+2;
            else 
                break;
        }
        return nums[i];
    }
}