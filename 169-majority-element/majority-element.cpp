class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int i,j,count;
        for(i=0;i<nums.size();i++){
            count=0;
            for(j=i;j<nums.size();j++){
                if(nums[i]==nums[j])
                    count++;
            }
            if(count>(nums.size()/2))   
                break;
        }
        return nums[i];
    }
};