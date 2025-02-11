class Solution {
public:
    int differenceOfSum(vector<int>& nums) {
        int x=0,y=0,rem=0;
        for(int i=0;i<nums.size();i++){
            x=x+nums[i];
            while(nums[i]!=0){
                rem=nums[i]%10;
                y=y+rem;
                nums[i]=nums[i]/10;
            }
        }
        return x-y;
    }
};