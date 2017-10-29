package Dtor;

public class tets {
	public static void main(String[] args) {
		System.out.println(Director.getInstance().getTimeSpeed());
		
		Director.getInstance().accelerateTimeSpeed();
		
		System.out.println(Director.getInstance().getTimeSpeed());
		
		Director.getInstance().accelerateTimeSpeed();
		Director.getInstance().accelerateTimeSpeed();
		Director.getInstance().accelerateTimeSpeed();
		
		System.out.println(Director.getInstance().getTimeSpeed());
		
		Director.getInstance().slowTimeSpeed();
		
		System.out.println(Director.getInstance().getTimeSpeed());
		
		Director.getInstance().undoTimeSpeed();
		
		System.out.println(Director.getInstance().getTimeSpeed());
		
		Director.getInstance().redoTimeSpeed();
		System.out.println(Director.getInstance().getTimeSpeed());
	}
}
