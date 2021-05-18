package medium.dp;

public class HouseRobber {
    public static void main(String[] args) {
        System.out.println(rob(new int[] {1,2,3,1})); //4
        System.out.println(rob(new int[] {2,7,9,3,1})); //12
        System.out.println(rob(new int[] {2,1,1,2})); //4
    }

    public static int rob(int[] nums) {
        int rob = 0;//max monney can get if rob current house
        int notrob = 0;//max money can get if not rob current house

        for (int i = 0; i < nums.length; i++) {
            int currob = notrob + nums[i]; //if rob current value, previous house must not be robbed
            notrob = Math.max(notrob, rob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
            rob = currob;
        }

        return Math.max(notrob, rob);

    }
}
