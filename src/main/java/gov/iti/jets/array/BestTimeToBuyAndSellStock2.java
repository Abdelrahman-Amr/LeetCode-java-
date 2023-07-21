package gov.iti.jets.array;

import java.util.Objects;

public class BestTimeToBuyAndSellStock2 {
    public int maxProfit(int[] prices) {
        int l=0,r=1, sum=0;
        while(r<prices.length)
        {
            if(prices[l] < prices[r])
            {
                sum += prices[r] - prices[l];
                l++;
            }
            else{
                l = r;
            }
            r++;
        }

        return sum;
    }
}
