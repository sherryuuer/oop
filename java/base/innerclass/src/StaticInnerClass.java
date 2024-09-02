package innerclass.src;

public class StaticInnerClass {
    private static int shared = 100;

    // 静态内部类
    public static class StaticInner {
        public void innerMethod() {
            System.out.println("Inner " + shared);
        }
    }

    public void test() {
        StaticInner si = new StaticInner();
        si.innerMethod();
    }
}
