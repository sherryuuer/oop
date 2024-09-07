public class Employee extends Person {
    private double salary;

    public Employee() {
    }

    public Employee(String name, String tel, String cardId, double salary) {
        super(name, tel, cardId);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String detail() {
        return super.detail() + ", Salary: " + salary;
    }
}
