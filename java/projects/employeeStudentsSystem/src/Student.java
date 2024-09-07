public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(String name, String tel, String cardId, double score) {
        super(name, tel, cardId);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String detail() {
        return super.detail() + ", Score: " + score;
    }
}
