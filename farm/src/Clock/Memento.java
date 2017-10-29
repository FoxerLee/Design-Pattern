package src.Clock;
/**
 * ʵ�ֱ���¼��
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Memento {
	private int TimeSpeed;
	private int CurrentTime;
	
	public int getTimeSpeed() {
		return TimeSpeed;
	}
	
	public int getCurrentTime() {
		return CurrentTime;
	}
	
	public Memento(int TimeSpeed,int currentTime) {
		this.TimeSpeed = TimeSpeed;
		this.CurrentTime = currentTime;
	}
}
