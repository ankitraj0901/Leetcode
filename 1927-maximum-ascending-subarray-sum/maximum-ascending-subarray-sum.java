class Solution {
    public int maxAscendingSum(int[] nums) {
        int i=0,j=0,sum=0,newsum=0,index=0;
        for(i=0;i<nums.length;i++){
            sum=0;
            for (j=index;j<nums.length-1;j++){
                if(nums[j]<nums[j+1]){
                    sum=sum+nums[j];
                }
                else{
                    sum=sum+nums[j];
                    newsum=newsum<sum?sum:newsum;
                    index=j+1;
                    break;
                }
            }
            if(j==nums.length-1){
                sum=sum+nums[j];
                newsum=newsum<sum?sum:newsum;
                break;
            }
        }
        return newsum;
    }
}