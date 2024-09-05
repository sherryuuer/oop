package arrays.src;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 9, 12, 15, 25, 34, 56, 57, 67, 78 };
        int value = 25;
        int index = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (value == arr[mid]) {
                index = mid;
                break;
            } else if (value < arr[mid]) {
                right = mid - 1;
            } else if (value > arr[mid]) {
                left = mid + 1;
            }
        }
        if (index == -1) {
            System.out.println(value + " is not exsits");
        } else {
            System.out.println(value + " index is " + index);
        }
    }
}
