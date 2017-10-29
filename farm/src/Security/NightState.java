package src.Security;
/**
 * 实现夜晚状态下安保系统的操作
 * @version 2017/10/26
 * @author LiMianHong
 */
public class NightState implements State{
	static private Phone phone;
	static private Fight fight;
	static private Alarm alarm;
	static private Monitor monitor;
	static private NightState night;
	@Override
	public void check() {
		monitor.run();
		alarm.run();
		phone.run();
		fight.run();
	}

	@Override
	public void attack() {
		phone.run();
		fight.run();
	}

	@Override
	public void checkTime(SecuritySystem system,int time) {
		if(time>18 && time < 6)
			system.changeState(DayState.getInstance());
	}
	
	static public NightState getInstance() {
		if(night == null) {
			night = new NightState();
			fight = new Fight();
			alarm = new Alarm();
			phone = new Phone();
			monitor = new Monitor();
		}
		return night;
	}
	
	private NightState() {
		
	}

}
