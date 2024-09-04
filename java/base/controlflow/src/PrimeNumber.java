package controlflow.src;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime Number between 1 ~ 100 are: ");
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            // 因为因子是成对出现了，所以只需要查到开根为止的数即可
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false; // flag值一旦被修改表示i被除尽
                    break; // 结束内层循环结构
                }
            }
            // 如果flag值没有被修改过，则为素数（只能被1和自己除）
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
