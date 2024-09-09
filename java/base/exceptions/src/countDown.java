package exceptions.src;

public class countDown {
    public static void main(String[] args) {
        try {
            countdown(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Count down goes wrong");
        } finally {
            System.out.println("Count down is over");
        }
    }

    public static void countdown(int seconds) throws InterruptedException {
        for (int i = seconds; i >= 0; i--) {
            System.out.println(i + "seconds");
            Thread.sleep(1000);
        }

    }

}
