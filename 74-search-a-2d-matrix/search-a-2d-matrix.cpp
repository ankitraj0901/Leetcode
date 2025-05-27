class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int i=0,j=matrix[i].size()-1,st=0,end=matrix.size()-1,mid;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target<=matrix[mid][j]){
                if(target>=matrix[mid][0])
                    break;
                end=mid-1;
            }
            else if(target>matrix[mid][j]){
                st=mid+1;
            }
            else
                return true;
        }
        if(i==matrix.size()){
            return false;
        }
        return BinarySearch(matrix,mid,j,target);
    }
    bool BinarySearch(vector<vector<int>>& matrix,int i,int j,int target){
        int st,end,mid=0;
        st=0;
        end=j;
        while(st<=end){
            mid=st+(end-st)/2;
            if(target<matrix[i][mid])
                end=mid-1;
            else if(target>matrix[i][mid])
                st=mid+1;
            else
                return true;
        }
        return false;
    }
};