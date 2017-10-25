package src.Base;
//Base Class for src.Action Object
abstract class Action {
	 /** 
     * The "target".
     * The target is the invoker of the src.Action
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
     * Run src.Action.
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
	
	//abstract public src.Action create();
	
	/** 
     * return Description of your action, like " is watering."
     */
	abstract protected String getDescription();
}
