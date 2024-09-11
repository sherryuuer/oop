public class OneAndOneTest {
    public static void main(String[] args) {
        Workbench bench = new Workbench();
        Cook c = new Cook(bench);
        Waiter w = new Waiter(bench);

        c.start();
        w.start();
    }
}
