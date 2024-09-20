package adapter;

public class Main {
    public static void main(String[] args) {
        Player wang = new FootballPlayer("Wang");
        wang.attack();
        wang.defense();
        // 这里使用的是多态定义Player为Translator
        Player jack = new Translator("Jack");
        jack.attack();
        jack.defense();
    }
}
