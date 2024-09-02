package abstracts.src;

// 子类 Rectangle 继承自 Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // 构造函数
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 实现抽象方法 area
    @Override
    double area() {
        return length * width;
    }
}
