class Solution {
    public void sortColors(int[] nums) {
        int i,j,data=0;
        for(i=0;i<nums.length;i++){
           int count=0;
            for(j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    count++;
                    data=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=data;
                }
            }
            if(count==0)
                break;
        }
    }
}