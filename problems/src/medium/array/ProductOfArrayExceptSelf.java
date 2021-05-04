package medium.array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int product = 1;
        // 0 - 1, 1 - 1, 2 - 2, 3 - 6
        for (int i = 0; i < nums.length; i++) {
            product *= i - 1 < 0 ? 1 : nums[i - 1];
            map.put(i, product);
        }

        product = 1;
        int[] result = new int[nums.length];
        // 3 - 6, 2 - 2 * 4 = 8, 1 - 1 * 12 = 12, 0 - 1 * 24 = 24
        for (int i = nums.length - 1; i >= 0 ; i--) {
            result[i] = map.get(i) * product;
            product *= nums[i];
        }

        return result;
    }

}
