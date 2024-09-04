package controlflow.src;

public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            int ones = num % 10;
            int tens = num / 10 % 10;
            int hundreds = num / 10 / 10 % 10;

            if ((hundreds * hundreds * hundreds + tens * tens * tens + ones * ones * ones) == num) {
                System.out.println(num);
            }
        }
    }
}
// 水仙花数：各个位的数字的立方和为本身
