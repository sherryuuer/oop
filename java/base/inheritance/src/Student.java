package inheritance.src;

public class Student extends Person {
    private double score;

    public Student(String name, int age) {
        // 呼出父类构造需要用super关键字
        super(name, age);
        System.out.println("Student class construct 1");
    }

    public Student(String name, int age, double score) {
        // 呼出自己的构造器用this关键字
        this(name, age);
        this.score = score;
        System.out.println("Student class construct 2");
    }

    public void detail() {
        // 这里必须用super，不然就会递归调用循环
        super.detail();
        System.out.println("Score: " + score);
    }
}
