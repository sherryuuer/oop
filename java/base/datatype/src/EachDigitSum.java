package datatype.src;

public class EachDigitSum {
    public static void main(String[] args) {
        int x = 123;
        int length = String.valueOf(x).length();
        System.out.println(length);

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += (x % 10);
            x = x / 10;
            // System.out.println(sum);
        }
        System.out.println("Sum is " + sum);
    }
}
