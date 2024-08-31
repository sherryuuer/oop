package inheritance.src;

public class MainForChildBase {
    public static void main(String[] args) {
        System.out.println("---- new Child()");
        Child c = new Child();
        System.out.println("---- c.action()");
        c.action();

        Base b = c;
        System.out.println("---- b.action()");
        b.action();
        // 这两行因为有字段隐藏，所以被系统标识，暂且comment out
        // System.out.println("---- b.s: " + b.s);
        // System.out.println("---- c.s: " + c.s);
    }
}
