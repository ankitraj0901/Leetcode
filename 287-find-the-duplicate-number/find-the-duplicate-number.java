class Solution {
    public int findDuplicate(int[] nums) {
        int data=0;
        Arrays.sort(nums);
        for(int i=0,j=i+1;j<nums.length;i++,j++){
            if(nums[i]==nums[j]){
                data=nums[i];
                break;
            }
        }
        return data;
    }
}