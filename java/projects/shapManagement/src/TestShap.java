public class TestShap {
    public static void main(String[] args) {
        Shap[] shaps = new Shap[3];
        shaps[0] = new Circle(2.0);
        shaps[1] = new Triangle(3, 4, 5);
        shaps[2] = new Rectangle(2, 3);

        for (int i = 0; i <= shaps.length - 1; i++) {
            System.out.println(shaps[i].detail());
        }
    }
}
