package controlflow.src;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        int a = 1;
        int x = 100;

        switch (a) {
            case 2:
                x += 5;
            case 1:
                x += 5;
            case 3:
                x += 5;
        }

        System.out.println(x);
    }
}
// case语句中如果没有break，则将从满足条件的分支开始贯穿执行下面所有的case或者default中的语句
// 这里的情况是从case为1的行开始，下面的全执行，所以加了两次5
// 所以换句话说，switch必须和break配合使用才有意义
