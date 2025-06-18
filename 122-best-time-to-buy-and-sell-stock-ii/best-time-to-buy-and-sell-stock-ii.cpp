class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int buy_price = prices[0];
        int max_profit = 0;
        int res = 0, i;
        for (i = 1; i < prices.size(); i++){

            if (prices[i] < prices[i-1]){
                buy_price = prices[i];
                res += max_profit;
                max_profit = 0;
            }
            else{
                int curr_profit = prices[i] - buy_price;
                max_profit = max(curr_profit , max_profit);
            }
        }
        // if (buy_price < prices[i-1])
            res += max_profit;
        return res;
    }
};