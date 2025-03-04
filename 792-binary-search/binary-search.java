class Solution {
    public int search(int[] nums, int target) {
        // if(nums.length==0)
        //     return -1;
        // if(nums.length==1)
        //     if(nums[0]==target)
        //         return 0;
        //     else
        //         return -1;
        int mid=nums.length/2;
        if(target<nums[mid]){
            for(int i=0;i<mid;i++){
                if(nums[i]==target)
                    return i;
            }
        }
        else if(target>nums[mid]){
            for(int j=mid+1;j<nums.length;j++){
                if(nums[j]==target)
                    return j;
            }
        }
        else{
            return mid;
        }
        return -1;
    }
}