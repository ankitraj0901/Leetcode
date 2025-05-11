class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        map <int,int>m;
        for(int i=0;i<nums.size();i++){
            if(m.find(nums[i])!=m.end())
                m[nums[i]]=i;
            else
                m[nums[i]]=i;
        }
        for(auto e:m)
            cout<<e.first<<":"<<e.second<<endl;
        int index=0,max=0,count=1;
        while(index<nums.size()){
            if(m.find(nums[index]+1)!=m.end()){
                index=m[nums[index]+1];    
                count++;
            }
            else{
                if(max<count)
                    max=count;
                count=1;
                index++;
            }
        }
            
        return max;
    }
};