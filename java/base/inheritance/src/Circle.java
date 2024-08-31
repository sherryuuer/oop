package inheritance.src;

public class Circle extends Shape {
    private Point center; // 中心点
    private double r; // 半径

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("draw circle at "
                + center.toString()
                + " with r " + r
                + ", using color: "
                + getColor());
    }

    public double area() {
        return Math.PI * r * r;
    }

}
