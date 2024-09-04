package datatype.src;

public class SwapVariable2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a: " + a + ", b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        // 同一个数字异或自己两次，结果还是原来的数字
        System.out.println("a: " + a + ", b: " + b);
    }
}
