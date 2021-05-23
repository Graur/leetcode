package medium.dp;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[] {10,9,2,5,3,7,101,18})); //4
        System.out.println(lengthOfLIS(new int[] {0,1,0,3,2,3})); //4
        System.out.println(lengthOfLIS(new int[] {7,7,7,7,7,7,7})); //1
        System.out.println(lengthOfLIS(new int[] {4,10,4,3,8,9})); //3
        System.out.println(lengthOfLIS(new int[] {1,3,6,7,9,4,10,5,6})); //6
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 1;
        for (int i = 1; i < dp.length; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxval = Math.max(maxval, dp[j]);
                }
            }
            dp[i] = maxval + 1;
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }
}
