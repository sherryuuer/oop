package datatype.src;

public class SwapVariable {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("a: " + a + ", b: " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ", b: " + b);

    }
}
