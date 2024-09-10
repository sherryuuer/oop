package usefulclasses.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class removeCollectionElement {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            coll.add(random.nextInt(100));
        }
        System.out.println("Elements: " + coll);

        Iterator<Integer> iterator = coll.iterator();
        while (iterator.hasNext()) {
            Integer num = (Integer) iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("After delete even: " + coll);
    }
}
