package medium.dp;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[] {1,2,5}, 11)); //3
        System.out.println(coinChange(new int[] {10,2,1,4,7,3,3,5}, 9)); //2
        System.out.println(coinChange(new int[] {2}, 3)); //-1
        System.out.println(coinChange(new int[] {1}, 0)); //0
        System.out.println(coinChange(new int[] {1}, 1)); //1
        System.out.println(coinChange(new int[] {1}, 2)); //2
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
