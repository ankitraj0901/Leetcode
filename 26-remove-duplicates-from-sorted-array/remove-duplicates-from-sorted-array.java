class Solution {
    public int removeDuplicates(int[] nums){
        int k=1;
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]!=arr[k-1]){
                arr[k]=nums[i];
                k++;
            }
        }
        for(int b=0;b<k;b++)
            nums[b]=arr[b];
        return k;
    }
}