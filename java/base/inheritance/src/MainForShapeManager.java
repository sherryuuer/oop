package inheritance.src;

public class MainForShapeManager {
    public static void main(String[] args) {
        // Point center = new Point(2, 3);
        // Circle circle = new Circle(center, 2);

        // circle.draw();
        // System.out.println(circle.area());

        ShapeManager manager = new ShapeManager();
        manager.addShape(new Circle(new Point(4, 4), 3));
        manager.addShape(new Line(new Point(2, 3), new Point(3, 4), "green"));
        manager.addShape(new ArrowLine(new Point(1, 2), new Point(5, 5), "black", false, true));
        manager.draw();
    }
}

// 这里addshape可以放进去的是Shape类型，但是它的子类们也可以放进去，这叫向上转型
// shape可以引用任何Shape的子类，这就叫做多态，父类是静态类型，子类是动态类型
// 子类可以继承父类的非private属性和方法，也可以增加和重写
// 如果子类中有重名方法，可以用super关键词强调父类方法

// 不希望被重写的父类方法应该是private的，子类只能重写非private的父类方法
