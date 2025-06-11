class Solution {
    public int removeElement(int[] nums, int val) {
        int i,index=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}