package observer;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void inform();

    String getSubjectState();

    void setSubjectState(String action);
}
