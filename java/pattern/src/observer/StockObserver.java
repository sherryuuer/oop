package observer;

public class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSubjectState() + " " + name + " turn off the stock, keep working!");
    }
}
