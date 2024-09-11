package lambda.src;

// public class printOut {
//     public static void main(String[] args) {
//         new Thread(
//             new Runnable() {
//                 public void run() {
//                     System.out.println("Sally");
//                 }
//             }
//         ).start();
//     }
// }

public class printOut {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Sally")).start();
    }
}
