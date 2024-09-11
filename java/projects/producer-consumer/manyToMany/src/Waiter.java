public class Waiter extends Thread {
    private Workbench workbench;

    public Waiter(Workbench workbench) {
        super();
        this.workbench = workbench;
    }

    public void run() {
        while (true) {
            workbench.take();
        }
    }
}
