package visitor;

public class Woman extends Person {
    protected String name = "女人";

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }

}
