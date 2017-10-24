<<<<<<< HEAD:farm/Action/Action.java
package action;
//Base Class for action Object
abstract class Action {
	 /** 
     * The "target".
     * The target is the invoker of the action
=======
package src.Action;
//Base Class for src.Action Object
abstract class Action {
	 /** 
     * The "target".
     * The target is the invoker of the src.Action
>>>>>>> master:farm/src/Action/Action.java
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
<<<<<<< HEAD:farm/Action/Action.java
     * Run action.
=======
     * Run src.Action.
>>>>>>> master:farm/src/Action/Action.java
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
	
<<<<<<< HEAD:farm/Action/Action.java
	//abstract public action create();
=======
	//abstract public src.Action create();
>>>>>>> master:farm/src/Action/Action.java
	
	/** 
     * return Description of your action, like " is watering."
     */
	abstract protected String getDescription();
}
