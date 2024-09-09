package exceptions.src;

public class MyArrays {
    public static int indexOf(int[] arr, int value) {
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    return i;
                }
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        } finally {
            System.out.println("Search is done");
        }
    }
}
