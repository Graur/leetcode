package easy.binary;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {3,0,1})); //2
        System.out.println(missingNumber(new int[] {0,1})); //2
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1})); //8
    }

    /**
     * Gauss' Formula
     */
    public static int missingNumber(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}
