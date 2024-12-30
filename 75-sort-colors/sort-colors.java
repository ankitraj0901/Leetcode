class Solution {
    public void sortColors(int[] nums) {
        int i,j,data=0;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]>=nums[j]){
                    data=nums[i];
                    nums[i]=nums[j];
                    nums[j]=data;
                }
            }
        }
    }
}