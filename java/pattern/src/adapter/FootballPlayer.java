package adapter;

public class FootballPlayer extends Player {
    public FootballPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Football player " + name + " is attacking!");
    }

    @Override
    public void defense() {
        System.out.println("Football player " + name + " is defensing!");
    }
}
