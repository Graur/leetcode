package easy.binary;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011)); //3
        System.out.println(hammingWeight(00000000000000000000000010000000)); //1
//        System.out.println(hammingWeight(11111111111111111111111111111101)); //31
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int mask = 1;
        int bitsCount = 0;
        for (int i = 0; i < 32; i++) {
            if ((mask & n) != 0) {
                bitsCount++;
            }
            mask = mask << 1;
        }
        return bitsCount;
    }
}
