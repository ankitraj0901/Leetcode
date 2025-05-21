class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        int st=0,end=nums.size()-1,mid,res1=-1,res2=-1;
        vector <int>v1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target>nums[mid])
                st=mid+1;
            else if(target<nums[mid])
                end=mid-1;
            else{
                res1=mid;
                end=mid-1;
            }
        }
        st=0;
        end=nums.size()-1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target>nums[mid])
                st=mid+1;
            else if(target<nums[mid])
                end=mid-1;
            else{
                res2=mid;
                st=mid+1;
            }
        }
        if(res1<0)
            return v1;
        for(int i=res1;i<=res2;i++)
            v1.push_back(i);
        
        return v1;        
    }
};