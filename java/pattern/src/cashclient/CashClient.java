package cashclient;

public class CashClient {
    public static void main(String[] args) {
        double num = 10;
        double price = 100;

        CashContext cc1 = new CashContext("normal");
        CashContext cc2 = new CashContext("return");
        CashContext cc3 = new CashContext("rebate");

        System.out.println(cc1.getResult(price * num));
        System.out.println(cc2.getResult(price * num));
        System.out.println(cc3.getResult(price * num));
    }
}
