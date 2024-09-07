package inheritance.src;

public class CallConstructorTest {
    public static void main(String[] args) {
        Student student1 = new Student("jan", 18);
        student1.detail();

        Student student2 = new Student("sally", 19, 99);
        student2.detail();
    }
}

// 输出如下：
// 看出父类构造器一定会被呼出，没有定义score的情况下有一默认值0.0

// from father class
// Student class construct 1
// name: jan, age: 18
// Score: 0.0
// from father class
// Student class construct 1
// Student class construct 2
// name: sally, age: 19
// Score: 99.0
