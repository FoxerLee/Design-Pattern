package src.Action;

import src.Base.Action;

public class Watering extends Action {
	private Integer type = 0;
	protected Watering() {}
	public String getDescription() {
		String str = "is watering.";
		return str;
	}
	
	static public Action create(int type) {
		Watering instance = new Watering();
		instance.type = type;
		return instance;
	}
	
	static public Action create() {
		Action instance = new Watering();
		return instance;
	}
	
	public boolean doSomething() {
		System.out.println(Target.getName() + " " + getDescription() + " type: " + type.toString());
		return true;
	} 
	
}
