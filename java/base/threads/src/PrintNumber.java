package threads.src;

public class PrintNumber implements Runnable {
    private int num = 1;

    public void run() {
        while (true) {
            synchronized (this) {
                try {
                    this.notify(); // 唤醒等待中的线程，这是因为前一个线程进入了wait状态
                    if (num <= 100) {
                        System.out.println(Thread.currentThread().getName() + ":" + num);
                        num++;
                        this.wait(); // 当前进程等待，释放锁，等待其他线程执行
                    } else {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
