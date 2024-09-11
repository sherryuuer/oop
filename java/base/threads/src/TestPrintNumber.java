package threads.src;

public class TestPrintNumber {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();

        new Thread(p).start();
        new Thread(p).start();
    }
}
