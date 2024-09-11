package threads.src;

public class TestSaleSyncBlock {
    public static void main(String[] args) {
        TicketSyncBlock ticket = new TicketSyncBlock();

        SaleSyncBlock t1 = new SaleSyncBlock("window-1", ticket);
        SaleSyncBlock t2 = new SaleSyncBlock("window-2", ticket);
        SaleSyncBlock t3 = new SaleSyncBlock("window-3", ticket);

        t1.start();
        t2.start();
        t3.start();
    }
}
