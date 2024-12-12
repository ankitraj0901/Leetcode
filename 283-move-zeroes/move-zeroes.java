class Solution {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
        }
        if (count == nums.length) {
            return;
        }
        int arr1[]=new int[nums.length];
        for (int i = 0,k=0; i < arr1.length; i++) {
            if(nums[i]!=0){
                arr1[k]=nums[i];
                k++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            nums[i]=arr1[i];

        }
    }
}