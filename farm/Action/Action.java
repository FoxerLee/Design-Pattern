package action;
//Base Class for Action Object
abstract class Action {
	 /** 
     * The "target".
     * The target is the invoker of the Action
     * The target will be set in the runAction() method of Entity.java with the 'setTarget' method.
     */
	Entity Target;
	
	/** 
     * Getter & Setter
     */
	Entity getTarget(){
		return Target;
	}
	void setTarget(Entity Target) {
		this.Target = Target;
	}
	
	protected Action() {}
	
	/** 
     * Run Action.
     * We can add more operation in this method.
     * Design Pattern: Template Method.
     */
	public boolean run() {
		return doSomething();
	}
	
	/** 
     * Content will be edited by the developer.
     */
	abstract protected boolean doSomething(); 
	
	//abstract public Action create();
	
	/** 
     * return Description of your action, like " is watering."
     */
	abstract protected String getDescription();
}
