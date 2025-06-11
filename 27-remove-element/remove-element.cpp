class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        if(nums.size()==0)
            return 0;
        if(nums.size()==1 && nums[0]==val)
            return 0;
        if(nums.size()==1 && nums[0]!=val)
            return 1;
        int i,j,count=0;
        for(i=0;i<nums.size()-count;i++){
            if(nums[i]==val){
                count++;
                j=i;
                while(j<nums.size()-1){
                    nums[j]=nums[j+1];
                    j++;
                }
                i--;
                if(i+1==nums.size()-count)
                    return i+1;
            }
        }
        return i;      
    }
};