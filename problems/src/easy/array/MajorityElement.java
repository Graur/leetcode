package easy.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {3,2,3}));
    }

    public static int majorityElement(int[] nums) {
        int majority = nums.length/2;
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                map.put(nums[i], ++ value);
            } else {
                map.put(nums[i], 1);
            }
        }

        int res = 0;
        int max = 0;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() > max) {
                max = pair.getValue();
                res = pair.getKey();
            }
        }

        return res;
    }
}
