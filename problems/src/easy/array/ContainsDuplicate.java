package easy.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,1}));
        System.out.println(containsDuplicate(new int[] {1,2,3,4}));
        System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

}
