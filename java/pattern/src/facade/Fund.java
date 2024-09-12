package facade;

import facade.data.Stock1;
import facade.data.Stock2;
import facade.data.Stock3;

public class Fund {
    private Stock1 st1;
    private Stock2 st2;
    private Stock3 st3;

    public Fund() {
        st1 = new Stock1();
        st2 = new Stock2();
        st3 = new Stock3();
    }

    public void buyFund() {
        st1.buy();
        st2.buy();
        st3.buy();
    }

    public void sellFund() {
        st1.sell();
        st2.sell();
        st3.sell();

    }
}
