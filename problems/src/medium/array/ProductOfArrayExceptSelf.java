package medium.array;


import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];
        productArray[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            productArray[i] = nums[i - 1] * productArray[i - 1];
        }

        int product = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            productArray[i] *= product;
            product *= nums[i];
        }

        return productArray;
    }

}
