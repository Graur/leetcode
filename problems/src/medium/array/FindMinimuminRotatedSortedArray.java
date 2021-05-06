package medium.array;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2})); //1
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2})); //0
        System.out.println(findMin(new int[]{11,13,15,17})); //11
    }

    /**
     * O(n) solution
     */
    public static int findMin(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (res > nums[i]) {
                return nums[i];
            }
        }
        return res;
    }
}
