package arrays.src;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 2, 45, 9, 23 };

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);
    }
}
