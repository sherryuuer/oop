package threads.src;

public class SaleSyncBlock extends Thread {
    private TicketSyncBlock ticket;

    public SaleSyncBlock(String name, TicketSyncBlock ticket) {
        super(name);
        this.ticket = ticket;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                ticket.sale();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}
