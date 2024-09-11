package threads.src;

public class CountDown {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()); // 使main线程阻塞1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Happy new year!");
    }
}
