class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int i=0,j=matrix[i].size()-1;
        while(i<matrix.size() && j<matrix[i].size()){
            if(target<matrix[i][j]){
                break;
            }
            else if(target>matrix[i][j]){
                i++;
            }
            else
                return true;
        }
        if(i==matrix.size()){
            return false;
        }
        return BinarySearch(matrix,i,j,target);
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