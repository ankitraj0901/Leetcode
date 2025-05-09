class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map <int,int>m;
        vector <int>v1;
        for(int i=0;i<nums.size();i++){
            if(m.find(nums[i])!=m.end()){
                m[nums[i]]+=1; 
            }
            else
                m[nums[i]]=1;
        }
        int temp=0,index=0;
        map <int,bool>m2;
        for(int j=0;j<k;j++){
            temp=0;
            for(auto e:m){
                if(m2[e.first]==true)
                    continue;
                else{
                    if(temp<e.second){
                        temp=e.second;
                        index=e.first;
                        cout<<index;
                    }
                }
            }
            v1.push_back(index);
            m2[index]=true;
            
        }
        return v1;
    }
};