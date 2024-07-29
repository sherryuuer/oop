package proxyclient;

public class Proxy implements GiveGift {
    Pursuit boy;

    public Proxy(SchoolGirl girl) {
        this.boy = new Pursuit(girl);
    }

    public void giveDolls() {
        boy.giveDolls();
    }

    public void giveFlowers() {
        boy.giveFlowers();
    }

    public void giveChocolate() {
        boy.giveChocolate();
    }
}
