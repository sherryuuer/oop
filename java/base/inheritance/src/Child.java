package inheritance.src;

public class Child extends Base {
    public static int s;
    private int a;
    // class_init() 类初始化代码
    static {
        System.out.println("子类静态代码块, s: " + s);
        s = 10;
    }
    // instance_init() 实例初始化代码
    {
        System.out.println("子类实例代码块, a: " + a);
        a = 10;
    }

    // instance_init() 实例初始化代码
    public Child() {
        System.out.println("子类构造方法, a: " + a);
        a = 20;
    }

    // 实例方法
    protected void step() {
        System.out.println("child s: " + s + ", a: " + a);
    }

}
