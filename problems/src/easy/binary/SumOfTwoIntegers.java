package easy.binary;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2)); //3
        System.out.println(getSum(2, 3)); //5
    }

    public static int getSum(int a, int b) {
        int xor = 0;
        while (a != 0) {
            xor = a ^ b;
            a = a & b;
            a = a << 1;
            b = xor;
        }
        return b;
    }
}
