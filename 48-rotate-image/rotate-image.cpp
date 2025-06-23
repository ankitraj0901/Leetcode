class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        reverse(matrix.begin(),matrix.end());
        for (int i = 0; i < matrix.size(); i++) {

            for (int j = i+1, k = i+1; j < matrix[i].size(); j++,k++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }
};