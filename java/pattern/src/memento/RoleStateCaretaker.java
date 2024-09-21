package memento;

public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }

    public RoleStateMemento getMemento() {
        return memento;
    }
}
