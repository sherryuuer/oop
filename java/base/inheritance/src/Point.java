package inheritance.src;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2)
                + Math.pow(this.y - point.getY(), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// 在 toString 方法中，+ 运算符用于字符串连接。
// return "(" + x + ", " + y + ")"; 将 x 和 y
// 的值转换为字符串，并与其他部分的字符串拼接在一起，形成一个表示点的字符串。
