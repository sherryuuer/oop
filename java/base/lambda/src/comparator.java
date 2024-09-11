package lambda.src;

import java.util.Arrays;
// import java.util.Comparator;

public class comparator {
    public static void main(String[] args) {
        Integer[] arr = { 1, 3, 4, 6, 2 };
        // Arrays.sort(arr, new Comparator<Integer>() {
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return -Integer.compare(o1, o2);
        // }
        // });

        // Arrays.sort(arr, (Integer o1, Integer o2) -> {
        // return Integer.compare(o1, o2);
        // });

        Arrays.sort(arr, (o1, o2) -> Integer.compare(o2, o1));
        // 函数式编程真的很简洁
        System.out.println(Arrays.toString(arr));
    }
}
