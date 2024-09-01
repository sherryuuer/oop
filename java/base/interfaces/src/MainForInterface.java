package interfaces.src;

import java.util.Arrays;

public class MainForInterface {
    public static void main(String[] args) {
        // 接口只能通过类创建
        MyComparable p1 = new Point(2, 3);
        MyComparable p2 = new Point(1, 2);
        System.out.println(p1.compareTo(p2));

        Point[] points = new Point[] {
                new Point(2, 3),
                new Point(3, 4),
                new Point(1, 2)
        };
        System.out.println("max: " + CompUtil.max(points));
        CompUtil.sort(points);
        System.out.println("sort: " + Arrays.toString(points));
    }
}
