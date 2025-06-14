class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i,j,count=0;
        for(i = 0,j = 1;j < nums.size();j++){
            if(nums[i] == nums[j])
                count++;
            else
                count=0;
            if(count<2)
                nums[++i]=nums[j];
        }
        return i+1;   
    }
};