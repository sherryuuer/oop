package threads.src;

public class TestFirstThread {
    public static void main(String[] args) {
        FirstThread my1 = new FirstThread();
        my1.start();
        FirstThread my2 = new FirstThread();
        my2.start();

        for (int i = 5; i >= 1; i--) {
            System.out.println(Thread.currentThread().getName() + "Thread: " + i); // 因为没有继承Thread类所以要调用静态方法
        }
    }
}
