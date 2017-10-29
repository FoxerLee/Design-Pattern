package src.Security;
/**
 * ʵ�ְ���״̬�°���ϵͳ�Ĳ���
 * @version 2017/10/26
 * @author LiMianHong
 */
public class DayState implements State{
	//战斗系统
	static private Fight fight;
	//警报系统
	static private Alarm alarm;
	//监控系统
	static private Monitor monitor;
	//单例类的实例
	static private DayState day;
	
	/**
     * 检测是否存在敌人并做出反馈
     *
     */
	@Override
	public void check() {
		monitor.run();
		alarm.run();
		fight.run();
	}

	//主动攻击
	@Override
	public void attack() {
		fight.run();
	}

	//检查当前时间并判断是否需要切换状态
	@Override
	public void checkTime(SecuritySystem system,int time) {
		if(time<18 && time > 6)
			system.changeState(NightState.getInstance());
	}
	
	/**
     * 获取单例类的实例
     *
     *@return 单例类的实例
     */
	static public DayState getInstance() {
		if(day == null) {
			day = new DayState();
		}
		return day;
	}
	
	private DayState() {
		fight = new Fight();
		alarm = new Alarm();
		monitor = new Monitor();
	}
}
