package generics.src;

import java.util.ArrayList;
import java.util.Collection;

public class arrayToCollectionMethod {
    // 泛型方法
    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T object : a) {
            c.add(object);
        }
    }

    public static void main(String[] args) {
        String[] strings = { "hello", "world", "java" };
        ArrayList<String> stringList = new ArrayList<>();
        fromArrayToCollection(strings, stringList);
        for (String s : stringList) {
            System.out.println("s = " + s);
        }

        Integer[] integers = { 1, 2, 3, 4, 5 };
        ArrayList<Integer> integerList = new ArrayList<>();
        fromArrayToCollection(integers, integerList);
        for (Integer i : integerList) {
            System.out.println("integer = " + i);
        }
    }
}
