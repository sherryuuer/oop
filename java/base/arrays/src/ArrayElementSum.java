package arrays.src;

public class ArrayElementSum {
    public static void main(String[] args) {
        double[] scores = { 99.5, 23.6, 34.7 };

        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("Sum is " + sum);
    }
}
