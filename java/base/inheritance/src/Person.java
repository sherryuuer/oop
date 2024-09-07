package inheritance.src;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("from father class");
    }

    public void detail() {
        System.out.println("name: " + name + ", age: " + age);
    }
}
