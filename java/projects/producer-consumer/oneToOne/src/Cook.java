public class Cook extends Thread {
    private Workbench workbench;

    public Cook(Workbench workbench) {
        super();
        this.workbench = workbench;
    }

    public void run() {
        while (true) {
            workbench.put();
        }
    }
}
