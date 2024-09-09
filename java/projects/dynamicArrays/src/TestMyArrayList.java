import java.util.Arrays;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList my = new MyArrayList(3);
        my.add("A");
        my.add("B");
        my.add("C");
        my.add(1, "D");
        my.add("G");
        System.out.println("Size: " + my.size());
        Object[] all = my.getAll();
        System.out.println(Arrays.toString(all));
    }
}
