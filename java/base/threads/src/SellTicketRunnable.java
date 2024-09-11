package threads.src;

public class SellTicketRunnable implements Runnable {
    private int tickets = 5;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 0) {
                System.out.println("Sold out");
                break;
            }
            System.out.println(Thread.currentThread().getName() + " one ticket sold, current: " + (--tickets));
        }
    }
}
