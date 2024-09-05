package arrays.src;

public class BubbleSort {
    public static void main(String[] args) {
        double[] scores = { 99.5, 80.6, 87.7, 67.0, 85.0 };

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    double temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println(scores);
    }
}
// 冒泡排序的精髓就是不断缩小排序范围，每次都将最大的移动到最右边
