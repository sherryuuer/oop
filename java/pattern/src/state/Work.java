package state;

public class Work {
    private State current;

    public Work() {
        current = new ForenoonState();
    }

    public void setState(State s) {
        current = s;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }

    private int hour;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    private boolean finish = false;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
