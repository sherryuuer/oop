package inheritance.src;

public class Shape {
    private static final String DEFAULT_COLOR = "black";
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        this(DEFAULT_COLOR);
        // 这里是调用另一个构造方法的意思
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("draw shape");
    }
}
