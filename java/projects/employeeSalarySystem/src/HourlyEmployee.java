public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(String name, MyData birthday, double wage, double hour) {
        super(name, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double earnings() {
        return wage * hour;
    }

    public String toString() {
        return this.getClass().getName() + " / " + super.toString();
    }

}
