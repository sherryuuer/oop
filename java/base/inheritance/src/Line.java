package inheritance.src;

public class Line extends Shape {
    private Point start;
    private Point end;

    public Line(Point start, Point end, String color) {
        // 调用父类方法的时候必须放在第一行
        super(color);
        this.start = start;
        this.end = end;
    }

    public double length() {
        return start.distance(end);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public void draw() {
        System.out.println("draw line from "
                + start.toString() + " to " + end.toString()
                + ", using color " + super.getColor()); // 如果子类中没有同名的方法，super不写也是可以的
    }

}
