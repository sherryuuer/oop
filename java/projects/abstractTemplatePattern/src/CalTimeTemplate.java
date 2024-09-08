public abstract class CalTimeTemplate {
    public final long getTime() {
        long start = System.currentTimeMillis();
        doWork();
        long end = System.currentTimeMillis();
        return end - start;
    }

    protected abstract void doWork();
}

// 设计一个用于计算时间的抽象模板类
