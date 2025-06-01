class Solution {
    public int search(int[] nums, int target) {
        int st=0,end=nums.length-1,mid;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]==target)
                return mid;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                st=mid+1;
        }   
        return -1;
    }
}