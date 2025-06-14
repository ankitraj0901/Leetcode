class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int res = k % nums.size();
        int j = nums.size()-1;
        int temp;
        for (int i = 0; i < j; i++, j--){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        int split = nums.size() - res;

        for (int a = 0, b = res-1; a < b; a++, b--){
            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }

        for (int a = res, b = nums.size()-1; a < b; a++, b--){
            temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }

};