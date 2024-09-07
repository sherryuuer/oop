public class Employee {
    private int id;
    private String name;
    private double salary;
    private String tel;

    public Employee() {
    }

    public Employee(int id, String name, double salary, String tel) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void detail() {
        System.out.println("Id: " + id + ", name: " + name + ", salary: " + salary + ", tel: " + tel);
    }
}
