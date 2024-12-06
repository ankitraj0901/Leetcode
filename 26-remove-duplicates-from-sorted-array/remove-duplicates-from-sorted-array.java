class Solution {
    public int removeDuplicates(int[] nums){
        int k=1;
        if(nums.length==0)
        return 0;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]!=nums[k-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}