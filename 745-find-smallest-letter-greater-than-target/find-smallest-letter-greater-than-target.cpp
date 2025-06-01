class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int st=0,end=letters.size()-1,mid,lstMin=-1,eq=-1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target==letters[mid])
                st=mid+1;
            else if(target<letters[mid]){
                lstMin=mid;
                end=mid-1;
            }
            else if(target>letters[mid]){
                st=mid+1;
            }
        }
        if(lstMin==-1)
            return letters[0];
        return letters[lstMin];
    }
};