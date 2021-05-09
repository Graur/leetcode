package medium.array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7})); //49
        System.out.println(maxArea(new int[] {1,1})); //1
        System.out.println(maxArea(new int[] {4,3,2,1,4})); //16
        System.out.println(maxArea(new int[] {1,2,1})); //2
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                    * (right - left));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return maxArea;
    }
}
