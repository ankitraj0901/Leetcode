class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int st = 0, end = numbers.size()-1;
        vector<int> res;
        while(st < end) {
            int sum = numbers[st] + numbers[end];
            if (sum < target) 
                st += 1 ;
            else if (sum > target)
                end -= 1;
            else if (sum == target){
                res.push_back(st+1);
                res.push_back(end+1);
                return res;
            }
                
        }
        
        return res;
    }
};