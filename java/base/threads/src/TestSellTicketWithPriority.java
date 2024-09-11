package threads.src;

public class TestSellTicketWithPriority {
    public static void main(String[] args) {
        SellTicketRunnable st = new SellTicketRunnable();

        Thread t1 = new Thread(st, "LP");
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(st, "HP");
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
