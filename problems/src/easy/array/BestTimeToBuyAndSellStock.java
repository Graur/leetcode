package easy.array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        int minprice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (minprice > prices[i]) {
                minprice = prices[i];
            } else if (prices[i] - minprice > result) {
                result = prices[i] - minprice;
            }
        }

        return result;
    }
}
