class Solution {
public:
       int maxProfit(vector<int>& prices) {

        int n = prices.size();
        int profit[prices.size()];

        memset(profit,0,sizeof(profit));
        int max_price=prices[n-1];

        for(int i=n-2;i>=0;i--){
            if(prices[i]>max_price) max_price=prices[i];
            profit[i] = max(profit[i + 1], max_price - prices[i]);
        }

        int min_price=prices[0];

        for (int i = 1; i < n; i++) {
            if (prices[i] < min_price) min_price = prices[i];
            profit[i] = max(profit[i - 1], profit[i] + (prices[i] - min_price));
        }

        int res=profit[n-1];

        return res;
    }

};