class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int scol = 0, ecol = matrix[0].size()-1;
        int srow = 0, erow = matrix.size()-1;
        vector<int> res;
        while(srow <= erow && scol <= ecol) {
            //top
            for(int j = scol; j <= ecol; j++) {
                res.push_back(matrix[srow][j]);
            }
            //right
            for(int i = srow+1; i <= erow; i++) {
                res.push_back(matrix[i][ecol]);
            }
            //bottom
            for(int j = ecol-1; j >= scol; j--) {
                if(srow == erow)
                    break;
                res.push_back(matrix[erow][j]);
            }
            //left
            for(int i = erow - 1; i > srow; i--) {
                if(scol == ecol)
                    break;
                res.push_back(matrix[i][scol]);
            }
            scol++;
            srow++;
            ecol--;
            erow--;

        } 
        return res;
    }
};