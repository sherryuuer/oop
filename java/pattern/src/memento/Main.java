package memento;

public class Main {
    public static void main(String[] args) {
        // 初始化游戏角色并展示
        GameRole fighter = new GameRole();
        fighter.getInitState();
        fighter.stateDisplay();

        // 保存进度
        RoleStateCaretaker StateAdmin = new RoleStateCaretaker();
        StateAdmin.setMemento(fighter.saveState());

        // 战斗并展示
        fighter.fight();
        fighter.stateDisplay();

        // 恢复初始化并展示
        fighter.recoveryState(StateAdmin.getMemento());
        fighter.stateDisplay();
    }
}
