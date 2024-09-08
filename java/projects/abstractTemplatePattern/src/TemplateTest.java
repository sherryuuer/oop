public class TemplateTest {
    public static void main(String[] args) {
        // 这创建的抽象类的实例但是实际使用重写的新的子类创建
        CalTimeTemplate c = new MyCalTime();
        System.out.println("Time: " + c.getTime());
    }
}
