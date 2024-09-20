package adapter;

public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
        System.out.println("Player name: " + this.name);
    }

    public abstract void attack();

    public abstract void defense();
}
