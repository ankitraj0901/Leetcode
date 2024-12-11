class Solution {
    public int missingNumber(int[] nums) {
        int i;
        Arrays.sort(nums);
        if(nums[0]==1)
            return 0;
        for(i=nums[0];i<=nums.length-1;i++){
            if(nums[i]!=i)
                break;
        }
        return i; 
    }
}