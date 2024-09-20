package adapter;

public class ForeignFootballPlayer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("Foreign Football player " + name + " is attacking!");
    }

    public void defense() {
        System.out.println("Foreign Football player " + name + " is defensing!");
    }
}
// 这是一个等待适配的对象
