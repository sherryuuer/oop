package proxyclient;

public class ProxyClient {
    public static void main(String[] args) {
        SchoolGirl girl = new SchoolGirl();
        girl.setName("Sally");

        Proxy proxy = new Proxy(girl);

        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
