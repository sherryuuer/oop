package cashclient;

public class CashReturn extends CashSuper {
    // get和set方法是为了封装私有属性
    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        if (money >= this.moneyCondition) {
            return money - Math.floor(money / this.moneyCondition) * moneyReturn;
        }
        return money;
    }

    public double getMoneyCondition() {
        return moneyCondition;
    }

    public void setMoneyCondition(double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    public double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }
}
