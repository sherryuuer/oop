import java.util.ArrayList;
import java.util.Collection;

public class TestShap {
    // public static void main(String[] args) {
    // Shap[] shaps = new Shap[3];
    // shaps[0] = new Circle(2.0);
    // shaps[1] = new Triangle(3, 4, 5);
    // shaps[2] = new Rectangle(2, 3);

    // for (int i = 0; i <= shaps.length - 1; i++) {
    // System.out.println(shaps[i].detail());
    // }
    // }
    public static <T extends Shap> void printArea(Collection<T> graphics) {
        for (T t : graphics) {
            System.out.println(t.area());
        }
    }

    public static void main(String[] args) {
        ArrayList<Circle> cList = new ArrayList<>();
        cList.add(new Circle(1.2));
        cList.add(new Circle(2.3));
        printArea(cList);

        ArrayList<Rectangle> rList = new ArrayList<>();
        rList.add(new Rectangle(1, 2));
        rList.add(new Rectangle(2, 3));
        printArea(rList);

        ArrayList<Shap> sList = new ArrayList<>();
        sList.add(new Rectangle(1, 2));
        sList.add(new Circle(2.3));
        sList.add(new Triangle(2, 3, 4));
        printArea(sList);
    }
}
// 多态
// 泛型
