package observer;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        Observer worker1 = new StockObserver("Jack", boss);
        Observer worker2 = new NBAObserver("Doky", boss);

        boss.attach(worker1);
        boss.attach(worker2);

        boss.detach(worker2);
        boss.setSubjectState("Back!");
        boss.inform();
    }
}
