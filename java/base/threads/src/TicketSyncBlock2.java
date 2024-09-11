package threads.src;

public class TicketSyncBlock2 {
    private int total = 10;

    // 同步方法
    public synchronized void sale() {
        if (total > 0) {
            --total;
            System.out.println(Thread.currentThread().getName() + "sold one, remain: " + total);
        } else {
            throw new RuntimeException("Sold out");
        }
    }

    public int getTotal() {
        return total;
    }
}
