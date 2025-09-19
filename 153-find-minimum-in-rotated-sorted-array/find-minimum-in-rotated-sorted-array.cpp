class Solution {
public:
    int findMin(vector<int>& nums) {
        int st=0,end=nums.size()-1,mid,res=-1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]>nums[0])
                st=mid+1;
            else if(nums[mid]<nums[0]){
                res=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        if(res==-1)
            return nums[0];
        return nums[res];
    }
};