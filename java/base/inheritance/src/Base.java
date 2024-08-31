package inheritance.src;

public class Base {
    public static int s;
    private int a;
    // class_init() 类初始化代码
    static {
        System.out.println("基类静态代码块, s: " + s);
        s = 1;
    }
    // instance_init() 实例初始化代码
    {
        System.out.println("基类实例代码块, a: " + a);
        a = 1;
    }

    // instance_init() 实例初始化代码
    public Base() {
        System.out.println("基类构造方法, a: " + a);
        a = 2;
    }

    // 实例方法
    protected void step() {
        System.out.println("base s: " + s + ", a: " + a);
    }

    // 实例方法
    public void action() {
        System.out.println("start");
        step();
        System.out.println("end");
    }
}
