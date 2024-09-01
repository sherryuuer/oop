package interfaces.src;

public class CompUtil {
    public static Object max(MyComparable[] objs) {
        if (objs == null || objs.length == 0) {
            return null;
        }
        MyComparable max = objs[0];
        for (int i = 1; i < objs.length; i++) {
            if (max.compareTo(objs[i]) < 0) {
                max = objs[i];
            }
        }
        return max;
    }

    // 选择排序算法
    public static void sort(MyComparable[] objs) {
        for (int i = 0; i < objs.length; i++) {
            int min = i;
            for (int j = i + 1; j < objs.length; j++) {
                if (objs[j].compareTo(objs[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                MyComparable temp = objs[i];
                objs[i] = objs[min];
                objs[min] = temp;
            }
        }
    }

}
