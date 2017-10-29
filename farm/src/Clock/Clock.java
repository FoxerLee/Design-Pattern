package src.Clock;
/**
 * 实现时间类
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Clock {
	private int timeSpeed;
	static private Clock clock;
	
	public void accelerate() {
		++(this.timeSpeed);
	}
	
	public void slow() {
		this.timeSpeed--;
	}
	
	static public Clock getInstance() {
		if(clock == null) {
			clock = new Clock();
			clock.timeSpeed = 0;
		}
		return clock;
	}
	
	public int getTimeSpeed() {
		return timeSpeed;
	}
	
	public Memento createMemento() {
		return new Memento(timeSpeed);
	}
	
	public void reinstateMemento(Memento memento) {
		this.timeSpeed = memento.getTimeSpeed();
	}
	
}
