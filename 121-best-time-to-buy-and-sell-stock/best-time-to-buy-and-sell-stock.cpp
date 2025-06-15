class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int i,j,res = 0;
        for (i = 0,j = 1; j < prices.size(); j++){
            if (prices[i] < prices[j]){
                if (res < prices[j] - prices[i])
                    res = prices[j] - prices[i];
            }
            else
                i=j;
        }
        if (i == prices.size()-1 && res == 0)
            return 0;
        return res;
    }
};