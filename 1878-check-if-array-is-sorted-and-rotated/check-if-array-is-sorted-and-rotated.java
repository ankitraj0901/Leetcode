class Solution {
    public boolean check(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1])
                continue;
            else{
                int j=0;
                for(j=i+1;j<nums.length-1;j++){
                    if(nums[j]<=nums[0] && nums[j]<=nums[j+1] && nums[nums.length-1]<=nums[0]){
                        continue;
                    }
                    else
                        break;
                }
                if(j==nums.length-1 && nums[nums.length-1]<=nums[0])
                    return true;
                return false;
            }
        }
        return true;
    }
}