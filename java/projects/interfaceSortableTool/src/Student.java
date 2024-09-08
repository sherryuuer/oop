public class Student implements Sortable {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return "Student{name=" + name + ", score=" + score + "}";
    }

    public int sort(Object obj) {
        // 这里是为了分数从大到小排列，所以取负数
        return -(this.score - ((Student) obj).score);
    }

}
