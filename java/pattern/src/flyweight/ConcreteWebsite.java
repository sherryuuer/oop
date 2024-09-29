package flyweight;

public class ConcreteWebsite extends Website {
    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("Website is " + name + ", User is " + user.getName());
    }

}
