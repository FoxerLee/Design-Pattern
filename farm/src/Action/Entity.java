package src.Action;

public class Entity {
	private String name; 
<<<<<<< HEAD:farm/Action/Entity.java
	protected Entity(){};//Developer is not allowed to new an Entity Object;
=======
	protected Entity() {};//Developer is not allowed to new an Entity Object;
>>>>>>> master:farm/src/Action/Entity.java
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
