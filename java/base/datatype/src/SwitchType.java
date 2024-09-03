package datatype.src;

public class SwitchType {
    public static void main(String[] args) {
        int a = 255;
        byte b = (byte) a;
        System.out.println(b); // -1
        // byte类型和short类型进行运算时，系统自动当作int类型处理。
        System.out.println(3 << 2); // 3的11左位移两位变为1100
        System.out.println(-3 >> 2);

    }

}
