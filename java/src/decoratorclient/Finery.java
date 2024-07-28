package decoratorclient;

public class Finery extends Person {
    // 人是服饰装饰的对象，也就是组件的对象，想像成人物模型
    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
