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
        System.out.println("---- b.s: " + b.s);
        System.out.println("---- c.s: " + c.s);
    }
}
