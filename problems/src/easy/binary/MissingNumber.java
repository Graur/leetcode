package easy.binary;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {3,0,1})); //2
        System.out.println(missingNumber(new int[] {0,1})); //2
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1})); //8
    }


    public static int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int realSum = 0;
        for (int i = 0; i < length; i++) {
            sum+=i + 1;
            realSum+= nums[i];
        }

        return sum - realSum;
    }
}
