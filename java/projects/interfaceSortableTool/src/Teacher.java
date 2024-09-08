public class Teacher implements Sortable {
    private String name;
    private double salary;

    public Teacher(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Teacher{name=" + name + ", salary=" + salary + "}";
    }

    public int sort(Object obj) {
        return Double.compare(this.salary, ((Teacher) obj).salary);
    }

}
