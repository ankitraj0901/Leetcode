import java.util.Vector;
class Solution {
    public void rotate(int[] nums, int k) {
        int res = k % nums.length;
        int j = nums.length-1;
        int temp;
        for (int i = 0; i < j; i++, j--){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int split = nums.length - res;

        for (int a = 0, b = res-1; a < b; a++, b--){
            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }

        for (int a = res, b = nums.length-1; a < b; a++, b--){
            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}