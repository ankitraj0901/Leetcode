class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
        vector <int>v1;
        int i,j,temp,index;
        for(i=0;i<nums.size();i++){
            temp=nums[i];
            index=i;
            for(j=i+1;j<nums.size();j++){
                if(temp>nums[j]){
                    temp=nums[j];
                    index=j;
                }
            }
            temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
        }
        int st=0,end=nums.size()-1,mid=0;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                st=mid+1;
            else
                break;
        }
        if(nums[mid]!=target)
            return v1;
        for(int k=0;k<nums.size();k++){
            if(nums[k]==nums[mid])
                v1.push_back(k);
        }
        return v1;
    }
};