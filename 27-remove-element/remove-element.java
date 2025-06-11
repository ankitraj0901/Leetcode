class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        if(nums.length==1 && nums[0]==val)
            return 0;
        if(nums.length==1 && nums[0]!=val)
            return 1;
        int i,j,temp;
        for(i=0,j=nums.length-1;i<=j;i++){
            if(nums[j]==val){
                j--;
                i--;
                continue;
            }
            if(nums[i]==val){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=nums[i];
                j--;
            }
        }
        return j+1;
    }
}