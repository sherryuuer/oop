package arrays.src;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] data = { 9, -16, 34, 23, 9, 3 };

        System.out.println("Before Sort: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        quickSort(data);

        System.out.println("After Sort: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void quickSort(int[] data) {
        subSort(data, 0, data.length - 1);
    }

    public static void subSort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                // 不断向右移动low，直到找到一个大于base的值
                while (low < end && data[++low] - base <= 0)
                    ;
                // 不断向左移动high，直到找到一个小于base的值
                while (high > start && data[--high] - base >= 0)
                    ;
                if (low < high) {
                    swap(data, low, high);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
