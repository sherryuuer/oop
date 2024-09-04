package controlflow.src;

public class BreakLabel {
    public static void main(String[] args) {
        out: for (int i = 1; i <= 5; i++) {
            // 因为in标签并没有被使用，所以可以删除
            // in: for (int j = 1; j <= 5; j++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i);
                System.out.println(j);
                System.out.println("---");
                if ((i + 1) == j) {
                    break out;
                }
            }
            System.out.println();
        }
    }
}
