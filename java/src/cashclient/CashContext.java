package cashclient;

public class CashContext {
    private CashSuper cs;

    public CashContext(String type) {
        switch (type) {
            case "normal":
                this.cs = new CashNormal();
                break;
            case "return":
                this.cs = new CashReturn("300", "100");
                break;
            case "rebate":
                this.cs = new CashRebate("0.7");
                break;
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
