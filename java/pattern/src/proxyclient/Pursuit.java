package proxyclient;

public class Pursuit implements GiveGift {
    SchoolGirl girl;

    public Pursuit(SchoolGirl girl) {
        this.girl = girl;
    }

    public void giveDolls() {
        System.out.println(girl.getName() + ", give you a doll");
    }

    public void giveFlowers() {
        System.out.println(girl.getName() + ", give you a flower");
    }

    public void giveChocolate() {
        System.out.println(girl.getName() + ", give you a chocolate");
    }
}
