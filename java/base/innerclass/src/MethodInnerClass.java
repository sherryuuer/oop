package innerclass.src;

public class MethodInnerClass {
    private int a = 100;

    // 注意这里的final声明是必须的，不然内部类无法访问
    public void test(final int param) {
        final String str = "Hello";
        // 方法内部类
        class Inner {
            public void innerMethod() {
                System.out.println("outer a: " + a);
                System.out.println("param: " + param);
                System.out.println("local var: " + str);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }
}
