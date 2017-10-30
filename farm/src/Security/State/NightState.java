package src.Security.State;

import src.Security.*;

/**
 * 实现夜晚状态下安保系统的操作
 * @version 2017/10/26
 * @author LiMianHong
 */
public class NightState implements State {
	//报警系统
	static private Phone phone;
	//战斗系统
	static private Fight fight;
	//警报系统
	static private Alarm alarm;
	//监控系统
	static private Monitor monitor;
	//单例类的实例
	static private NightState night;
	
	/**
     * 检测是否存在敌人并做出反馈
     *
     */
	@Override
	public void check() {
		monitor.run();
		alarm.run();
		phone.run();
		fight.run();
	}

	/**
     * 主动攻击
     *
     */
	@Override
	public void attack() {
		phone.run();
		fight.run();
	}
	//检查当前时间并判断是否需要切换状态
	@Override
	public void checkTime(SecuritySystem system, int time) {
		if(time>6 && time < 18) {
			system.changeState(DayState.getInstance());
		}
	}
	
	/**
     * 获取单例类的实例
     *
     *@return 单例类的实例
     */
	static public NightState getInstance() {
		if(night == null) {
			night = new NightState();
		}
		return night;
	}
	
	private NightState() {
		fight = new Fight();
		alarm = new Alarm();
		phone = new Phone();
		monitor = new Monitor();
	}

}
