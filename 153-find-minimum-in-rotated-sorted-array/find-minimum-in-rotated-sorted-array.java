class Solution {
    public int findMin(int[] nums) {
        int st=0,end=nums.length-1,mid;
        while(st<end){
            mid=st+(end-st)/2;
            if(nums[mid]>nums[end])
                st=mid+1;
            else
                end=mid;
        }   
        return nums[st];
    }
}