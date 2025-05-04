class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector <int>v1;
        int i=0,j=numbers.size()-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                v1.push_back(i+1);
                v1.push_back(j+1);
                return v1;
            }
            if(numbers[i]+numbers[j]>target)
                j--;
            else
                i++;
        }
        return v1;
    }
};