package src.Base;

public class Entity {
	private String name;
	protected Entity() {};//Developer is not allowed to new an Entity Object;

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
