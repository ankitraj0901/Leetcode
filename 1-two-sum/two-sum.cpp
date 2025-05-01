class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector <int>v1;
        map<int,int>m;
        for(int i=0;i<nums.size();i++){
            int first=nums[i];
            int second=target-first;
            if(m.find(second)!=m.end()){
                v1.push_back(i) ;
                v1.push_back(m[second]);
                break;
            }
            else{
                m[first]=i;
            }
        }
        return v1;
    }
};