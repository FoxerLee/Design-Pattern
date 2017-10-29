package src.Security;
/**
 * 实现安保系统
 * @version 2017/10/26
 * @author LiMianHong
 */
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
