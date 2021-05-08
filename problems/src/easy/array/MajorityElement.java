package easy.array;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
