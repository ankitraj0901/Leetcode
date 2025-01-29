class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        if(nums.length==2)
            return nums[1];
        int max=0,smax=0,tmax=0,i;
        max=nums[nums.length-1];
        for(i=nums.length-1;i>=0;i--){
            if(nums[i]<max){
                smax=nums[i];
                break;
            }
        }
        for(i=nums.length-1;i>=0;i--){
            if(nums[i]<smax){
                tmax=nums[i];
                break;
            }
        }
        if(i==-1)
            return max;
        return tmax;
    }
}