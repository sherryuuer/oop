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

// 注意，继承不是很好用，很多时候会带来混乱，不能很好的体现和父类之间的is-a关系
// 三种方法正确使用继承：
// 使用final关键字/优先使用组合而非继承/使用接口
