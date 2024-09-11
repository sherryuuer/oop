package threads.src;

public class TestSellTicketThread {
    public static void main(String[] args) {
        SellTicketThread s1 = new SellTicketThread();
        SellTicketThread s2 = new SellTicketThread();
        SellTicketThread s3 = new SellTicketThread();

        s1.start();
        s2.start();
        s3.start();
    }
}
