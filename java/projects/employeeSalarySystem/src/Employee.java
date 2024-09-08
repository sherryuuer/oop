public abstract class Employee {
    private String name;
    private MyData birthday;

    public Employee(String name, MyData birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyData getBirthday() {
        return birthday;
    }

    public void setBirthday(MyData birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    public String toString() {
        return "Name: " + name + ", Birthday: " + birthday.toDataString() + ", Earnings: " + earnings();
    }
}
