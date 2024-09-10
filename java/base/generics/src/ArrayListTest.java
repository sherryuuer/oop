package generics.src;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Object> strList = new ArrayList<>();

        strList.add("Beddy");
        strList.add("cat");
        strList.add(123);

        for (int i = 0; i < strList.size(); i++) {
            Object o = strList.get(i);
            // String str = strList.get(i);
            // System.out.println(str + " length is " + str.length());
            System.out.println(o);
        }
    }
}
