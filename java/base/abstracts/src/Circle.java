package abstracts.src;

// 子类 Circle 继承自 Shape
class Circle extends Shape {
    private double radius;

    // 构造函数
    public Circle(double radius) {
        this.radius = radius;
    }

    // 实现抽象方法 area
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
