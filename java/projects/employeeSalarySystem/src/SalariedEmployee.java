public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, MyData birthday, double monthlySalary) {
        super(name, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double earnings() {
        return monthlySalary;
    }

    public String toString() {
        return this.getClass().getName() + " / " + super.toString();
    }

}
