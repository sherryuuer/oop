package threads.src;

public class TestFirstRunnable {
    public static void main(String[] args) {
        FirstRunnable my = new FirstRunnable();
        // FirstRunnable my2 = new FirstRunnable();

        new Thread(my).start();
        new Thread(my).start();

        for (int i = 5; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + "Thread: " + i);
        }
    }
}
