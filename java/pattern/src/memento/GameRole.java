package memento;

public class GameRole {
	private int vit;
	private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
    	this.vit = vit;
    }

	public int getAtk() {
 		return atk;   
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	// show the state
	public void stateDisplay() {
		System.out.println("Current state: ");
		System.out.println("VIT: " + this.vit);
		System.out.println("ATK: " + this.atk);
		System.out.println("DEF: " + this.def);
		System.out.println();
	}

	// get the init state
	public void getInitState() {
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}

	// fight
	public void fight() {
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}

	// save the state to memento
	public RoleStateMemento saveState() {
		return new RoleStateMemento(vit, atk, def)
	}

	// recovery the role state
	public void recoveryState(RoleStateMemento memento) {
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}
}









