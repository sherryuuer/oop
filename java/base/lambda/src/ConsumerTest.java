package lambda.src;

import java.util.ArrayList;

public class ConsumerTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.forEach(e -> System.out.println(e));
        list.removeIf(str -> str.matches("A"));
    }
}
