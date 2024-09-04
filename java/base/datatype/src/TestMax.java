package datatype.src;

public class TestMax {
    public static void main(String[] args) {
        int a = 12;
        int b = 30;
        int c = -43;

        int max;

        max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        System.out.println("Max is " + max);
    }
}
