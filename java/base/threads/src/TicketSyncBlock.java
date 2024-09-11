package threads.src;

public class TicketSyncBlock {
    private int total = 10;

    public void sale() {
        // 同步代码块锁，这里意味着监视的是同一个对象this
        synchronized (this) {
            if (total > 0) {
                --total;
                System.out.println(Thread.currentThread().getName() + "sold one, remain: " + total);
            } else {
                throw new RuntimeException("Sold out");
            }
        }
    }

    public int getTotal() {
        return total;
    }
}
