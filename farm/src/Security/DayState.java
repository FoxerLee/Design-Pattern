package SecuritySystem;

public class DayState implements State{
	static private Fight fight;
	static private Alarm alarm;
	static private Monitor monitor;
	static private DayState day;
	@Override
	public void check() {
		monitor.run();
		alarm.run();
		fight.run();
	}

	@Override
	public void attack() {
		fight.run();
	}

	@Override
	public void checkTime(SecuritySystem system,int time) {
		if(time<18 && time > 6)
			system.changeState(NightState.getInstance());
	}
	
	static public DayState getInstance() {
		if(day == null) {
			day = new DayState();
			fight = new Fight();
			alarm = new Alarm();
			monitor = new Monitor();
		}
		return day;
	}
	
	private DayState() {
		
	}
}
