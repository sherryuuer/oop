public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String detail() {
        return "Account ID: " + id + ", Name: " + name + ", Balance: " + balance;
    }

    public void save(double money) {
        if (money <= 0) {
            throw new IllegalArgumentException("Number for saving can not be 0 or negative");
        }
        balance += money;
    }

    public void withdraw(double money) {
        if (money <= 0) {
            throw new IllegalArgumentException("Number for withdraw can not be 0 or negative");
        }
        if (money > balance) {
            throw new UnsupportedOperationException("Insufficient surplus, unsupported operation");
        }
        balance -= money;
    }
}
