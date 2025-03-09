class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> list;
    
    for (int i = 0; i < numRows; i++) {
        vector<int> temp;
        
        if (list.empty()) {
            temp.push_back(1);
            list.push_back(temp);
        } 
        else {
            if (list[i - 1].size() > 1) {
                temp.push_back(1);
                
                for (size_t k = 0; k < list[i - 1].size() - 1; k++) {
                    int val = list[i - 1][k] + list[i - 1][k + 1];
                    temp.push_back(val);
                }
                
                temp.push_back(1);
                list.push_back(temp);
            }
            else {
                temp.push_back(1);
                temp.push_back(1);
                list.push_back(temp);
            }
        }
    }
    
    return list;
    }
};