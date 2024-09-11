package threads.src;

public class TestSellTicketRunnable {
    public static void main(String[] args) {
        SellTicketRunnable st = new SellTicketRunnable();

        new Thread(st).start();
        new Thread(st).start();
        new Thread(st).start();
    }
}
