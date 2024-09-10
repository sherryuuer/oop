package generics.src;

public class Rectangle implements Comparable<Rectangle> {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    @Override
    public int compareTo(Rectangle o) {
        return Double.compare(area(), o.area());
    }

    @Override
    public String toString() {
        return "Rectangle{length=" + length + ", width=" + width + ", area=" + area() + "}";
    }
}
