package src.Clock;
/**
 * 实现备忘录类
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Memento {
	private int TimeSpeed;
	
	public int getTimeSpeed() {
		return TimeSpeed;
	}
	
	public Memento(int TimeSpeed) {
		this.TimeSpeed = TimeSpeed;
	}
}
