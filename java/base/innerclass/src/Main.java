package innerclass.src;

public class Main {
    public static void main(String[] args) {
        // 如何从外部创建内部类的示例
        MemberInnerClass outer = new MemberInnerClass();
        MemberInnerClass.Inner inner = outer.new Inner();
        inner.innerMethod();
    }
}
