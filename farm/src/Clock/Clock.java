package src.Clock;
/**
 * 时钟系统实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Clock {
	//时间流速
	private int timeSpeed;
	//单例类的实例
	static private Clock clock;
	//当前时间
	private int currentTime;
	
	//加快时间流速
	public void accelerate() {
		++(this.timeSpeed);
	}
	
	//减慢时间流速
	public void slow() {
		this.timeSpeed--;
	}
	
	/**
     * 获得单例类的实现
     *
     * @return 单例类的实现
     */
	static public Clock getInstance() {
		if(clock == null) {
			clock = new Clock();
			clock.timeSpeed = 1;
			clock.currentTime = 0;
		}
		return clock;
	}
	
	/**
     * 获取时间流速
     *
     * @return 时间流速
     */
	public int getTimeSpeed() {
		return timeSpeed;
	}
	
	/**
     * 获取当前备忘录
     *
     * @return 备忘录
     */
	public Memento createMemento() {
		return new Memento(timeSpeed,currentTime);
	}
	
	/**
     * 根据选取的备忘录恢复到当时的状态，包括时间流速与当前时间
     *
     * @param 想要恢复的状态所对应的备忘录
     */
	public void reinstateMemento(Memento memento) {
		this.timeSpeed = memento.getTimeSpeed();
		//this.currentTime = memento.getCurrentTime();
	}
	
	//时间增加
	public void timeGoseBy() {
		this.currentTime += timeSpeed;
		currentTime = currentTime%24;
	}
	
	/**
     * 获取当前时间
     *
     * @return 当前时间
     */
	public int getCurrentTime() {
		return currentTime;
	}
	
}
