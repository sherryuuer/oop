package usefulclasses.src;

public class stringReverseTool {
    // 将字符串的指定起始位置的字符串反转
    public static void main(String[] args) {
        String str = "abcdefgho";
        System.out.println(stringReverse(str, 2, 6));
        System.out.println(stringBuilderReverse(str, 2, 6));
    }

    // 使用String的方式进行反转
    public static String stringReverse(String str, int start, int end) {
        char[] array = str.toCharArray();
        for (int i = start, j = end - i; i < j; i++, j--) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        String s = new String(array);
        return s;
    }

    // 使用Builder进行反转，注意这里的end需要-1，才是指定的结束点
    public static String stringBuilderReverse(String str, int start, int end) {
        StringBuilder builder = new StringBuilder(str);
        String middle = new StringBuilder(str.substring(start, end - 1)).reverse().toString();
        return builder.replace(start, end - 1, middle).toString();
    }
}
