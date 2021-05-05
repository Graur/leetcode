package medium.array;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,3,-2,4})); //6
        System.out.println(maxProduct(new int[]{-2,0,-1})); //0
        System.out.println(maxProduct(new int[]{-2,3,-4})); //24
        System.out.println(maxProduct(new int[]{0,2})); //2
        System.out.println(maxProduct(new int[]{-4,-3,-2})); //12
    }

    public static int maxProduct(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
           int tmp = Math.max(nums[i] * max, Math.max(nums[i] * min, nums[i]));
           min = Math.min(nums[i] * max, Math.min(nums[i] * min, nums[i]));

           max = tmp;
           res = Math.max(max, res);
        }

        return res;
    }
}
