public class ManyAndManyTest {
    public static void main(String[] args) {
        Workbench bench = new Workbench();
        Cook c1 = new Cook(bench);
        Cook c2 = new Cook(bench);
        Waiter w1 = new Waiter(bench);
        Waiter w2 = new Waiter(bench);

        c1.start();
        c2.start();
        w1.start();
        w2.start();
    }
}
