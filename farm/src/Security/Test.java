package SecuritySystem;

public class Test {
	public static void main(String[] args) {
		SecuritySystem sys = SecuritySystem.getInstance();
		
		sys.Check();
		sys.Attack();
		
		System.out.println("\n\n");
		
		sys.changeState(NightState.getInstance());
		sys.Check();
		sys.Attack();
	}
}
