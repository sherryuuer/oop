package visitor;

public class Man extends Person {
    protected String name = "男人";

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

}
