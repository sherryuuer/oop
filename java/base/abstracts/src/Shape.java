package abstracts.src;

// 定义抽象类 Shape
abstract class Shape {
    // 抽象方法，不提供实现
    abstract double area();

    // 可以有其他非抽象方法
    public void display() {
        System.out.println("This is a shape.");
    }
}
