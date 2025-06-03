class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        int i,j,k;
        bool flag=false;
        vector<int> v1;
        for(i=0;i<nums1.size();i++){
            flag=false;
            for(j=0;j<nums2.size();j++){
                if(nums1[i]==nums2[j]){
                    break;
                }
            }
            for(k=j+1;k<nums2.size();k++){
                if(nums1[i]<nums2[k]){
                    v1.push_back(nums2[k]);
                    flag=true;
                    break;
                }
            }
            if(flag==false)
                v1.push_back(-1);
        }
        return v1;
    }
};