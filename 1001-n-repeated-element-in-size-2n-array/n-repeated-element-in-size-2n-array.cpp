class Solution {
public:
    int repeatedNTimes(vector<int>& nums) {
        int i,j,count;
        for(i=0;i<nums.size();i++){
            count=0;
            for(j=0;j<nums.size();j++){
                if(nums[i]==nums[j])
                    count++;
            }
            if(count>=2)
                return nums[i];
        }
        return -1;
    }
};