package decoratorclient;

public class DecoratorClient {
    public static void main(String[] args) {
        Person person = new Person("Sally");
        System.out.println("Show the first finery: ");

        Sneakers sneaker = new Sneakers();
        BigTrouser trouser = new BigTrouser();
        TShirts tshirt = new TShirts();

        sneaker.decorate(person);
        trouser.decorate(sneaker);
        tshirt.decorate(trouser);
        tshirt.show();
    }
}
