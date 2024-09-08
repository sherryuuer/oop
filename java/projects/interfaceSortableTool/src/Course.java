public class Course implements Sortable {
    private int id;
    private String title;

    public Course(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public String toString() {
        return "Course{id=" + id + ", title=" + title + "}";
    }

    public int sort(Object obj) {
        return this.id - ((Course) obj).id;
    }

}
