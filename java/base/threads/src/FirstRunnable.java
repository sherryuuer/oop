package threads.src;

public class FirstRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "Thread: " + i);
        }
    }

}
