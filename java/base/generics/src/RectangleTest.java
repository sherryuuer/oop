package generics.src;

import java.util.Arrays;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle[] arr = new Rectangle[3];
        arr[0] = new Rectangle(1, 4);
        arr[1] = new Rectangle(2, 2);
        arr[2] = new Rectangle(1, 3);

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
