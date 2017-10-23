package action;

public class Entity {
	private String name; 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public boolean runAction(Action action) {
		action.setTarget(this);
		return action.run();
	}
}
