package medium.array;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2})); //1
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2})); //0
        System.out.println(findMin(new int[]{11,13,15,17})); //11
    }

    /**
     * O(log n) solution
     */
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[end] > nums[start]) {
            return nums[start];
        }

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            if (nums[mid - 1] > nums[mid]) {
                return nums[mid];
            }

            if (nums[mid] > nums[0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
