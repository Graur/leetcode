package easy.dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2)); //2
        System.out.println(climbStairs(3)); //3
    }

    public static int climbStairs(int n) {
        int result = 0;
        int previousWays = 1;
        int prePreviousWays = 0;

        for (int i = 1; i < n + 1; i++) {
            result = previousWays + prePreviousWays;
            prePreviousWays = previousWays;
            previousWays = result;
        }
        return result;
    }
}
