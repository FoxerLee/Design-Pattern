package SecuritySystem;

public class SecuritySystem {
	private State state;
	static SecuritySystem system;
	
	static public SecuritySystem getInstance() {
		if(system == null) {
			system = new SecuritySystem();
		}
		return system;
	}
	private SecuritySystem() {
		this.state = DayState.getInstance();
	}
	
	public void Check() {
		state.check();
	}
	
	public void Attack() {
		state.attack();
	}
	
	public void changeState(State state) {
		this.state = state;
	}
	
	public void getClock() {
		
	}
	
}
