package mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator cm = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(cm);
        ConcreteColleague2 c2 = new ConcreteColleague2(cm);

        cm.setConcreteColleague1(c1);
        cm.setConcreteColleague2(c2);

        c1.send("Meal?");
        c2.send("No!");
    }

}
