package easy.array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        int left = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[left] < prices[i]) {
                if (result < prices[i] - prices[left]) {
                    result = prices[i] - prices[left];
                }
            } else {
                left = i;
            }
        }

        return result;
    }
}
