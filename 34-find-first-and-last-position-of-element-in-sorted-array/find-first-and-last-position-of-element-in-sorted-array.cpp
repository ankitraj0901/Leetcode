class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector <int>v1;
        if(nums.size()==0){
            v1.push_back(-1);
            v1.push_back(-1);
            return v1;
        }
        int st=0,end=nums.size()-1,mid,res1=-1,res2=-1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                st=mid+1;
            else{
                res1=mid;
                end=mid-1;
            }
        }
        st=0;
        end=nums.size()-1;   
        while(st<=end){
            mid=st+(end-st)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                st=mid+1;
            else{
                res2=mid;
                st=mid+1;
            }
        }
        if(res1<0){
            v1.push_back(-1);
            v1.push_back(-1);
        }
        else{
            v1.push_back(res1);
            v1.push_back(res2);
        }
        return v1;
    }
};