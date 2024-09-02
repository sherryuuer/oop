package innerclass.src;

public class MemberInnerClass {
    private int a = 100;

    // 成员内部类
    public class Inner {
        public void innerMethod() {
            System.out.println("outer a: " + a);
            // 外部类的实例方法，若没有重名方法，前两个前缀都可以省略
            MemberInnerClass.this.action();
        }
    }

    private void action() {
        System.out.println("action");
    }

    public void test() {
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
