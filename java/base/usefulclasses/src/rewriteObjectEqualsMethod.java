package usefulclasses.src;

import java.util.Objects;

public class rewriteObjectEqualsMethod {
    private String name;
    private int age;

    public rewriteObjectEqualsMethod(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // 如果两个对象的首地址相同那么一定相同
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        rewriteObjectEqualsMethod o = (rewriteObjectEqualsMethod) obj;
        return age == o.age && Objects.equals(name, o.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
