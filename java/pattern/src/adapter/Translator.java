package adapter;

public class Translator extends Player {
    private ForeignFootballPlayer ffp = new ForeignFootballPlayer();

    public Translator(String name) {
        super(name);
        ffp.setName(name);
    }

    @Override
    public void attack() {
        ffp.attack();
    }

    @Override
    public void defense() {
        ffp.defense();
    }
}
