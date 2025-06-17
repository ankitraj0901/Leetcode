class Solution {
public:
    int maximumDifference(vector<int>& nums) {
        int i,j,res = -1;
        for (i = 0, j = 1; j < nums.size(); j++){
            if (nums[i] < nums[j]){
                if (res < nums[j] - nums[i])
                    res = nums[j] - nums[i];
            }
            else
                i = j;
        }
        if(i == nums.size() && res == -1)
            return -1;
        return res; 
    }
};