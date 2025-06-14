class Solution {
    public void rotate(int[] nums, int k) {
        if (k % nums.length == 0)
            return;
        int i,j;
        int res = k % nums.length;
        int round=nums.length-res;
        int arr[]=new int[nums.length];
        for (i = round, j=0; i < nums.length; i++, j++){
            arr[j] = nums[i];
        }
        System.out.println(j);
        for (int m = 0; m < round; m++,j++)
            arr[j] = nums[m];

        for (int l = 0; l < nums.length; l++)
            nums[l] = arr[l];
    }
}