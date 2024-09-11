public class Workbench {
    private static final int MAX_VALUE = 1; // 工作台最大能放一份快餐
    private int num; // 工作上的快餐数量

    public synchronized void put() {
        if (num >= MAX_VALUE) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("Put and num is: " + num);
        this.notify();
    }

    public synchronized void take() {
        if (num <= 0) {
            try {
                this.wait(); // 服务员线程等待，wait方法由锁对象this调用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("Take and num is: " + num);
        this.notify();
    }

}
