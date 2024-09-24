package singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("s1 and s2 are same instance");
        }

        // multi thread 这里使用set是为了去除重复，这样到最后，set中只有一个instance
        Set<String> instanceSet = Collections.synchronizedSet(new HashSet<>());

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                instanceSet.add(Singleton.getInstance().toString());
            }).start();
        }

        for (String instance : instanceSet) {
            System.out.println(instance);
        }
    }
}
