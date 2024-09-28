package mediator;

public class ConcreteMediator extends Mediator {
    public ConcreteColleague1 concreteColleague1;
    public ConcreteColleague2 concreteColleague2;

    public void setConcreteColleague1(ConcreteColleague1 cc1) {
        this.concreteColleague1 = cc1;
    }

    public void setConcreteColleague2(ConcreteColleague2 cc2) {
        this.concreteColleague2 = cc2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == concreteColleague1) {
            concreteColleague2.notify(message);
        } else {
            concreteColleague1.notify(message);
        }
    }

}
