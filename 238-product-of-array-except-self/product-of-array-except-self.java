class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,mul1=1,mul2=1,count=0;
        boolean flag=false,flag2=false;
        int arr[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                mul1=0;
                flag=true;
            }
            else{
                mul2*=nums[i];
                flag2=true;
            }
        }
        if(i==nums.length && mul2==1 && flag2==false)
            mul2=0;
        for(int m=0;m<nums.length;m++){
            if(nums[m]==0)
                count++;
        }
        if(flag==true){
            for(int k=0;k<nums.length;k++){
                if(nums[k]==0 && count==1)
                    arr[k]=mul2;
                else
                    arr[k]=0;
            }

        }
        else{
            for(int l=0;l<nums.length;l++)
                arr[l]=mul2/nums[l];
        }
        return arr;
    }
}