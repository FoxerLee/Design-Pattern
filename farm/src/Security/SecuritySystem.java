package src.Security;

import src.Base.Director;

/**
 * 安保系统实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class SecuritySystem {
	//记录当前状态
	private State state;
	//单例类的实现
	static SecuritySystem system;
	
	/**
     * 返回单例类的实现
     *
     * @return 单例类的实现
     */
	static public SecuritySystem getInstance() {
		if(system == null) {
			system = new SecuritySystem();
		}
		return system;
	}
	
	/**
     * 返回单例类的实现
     *
     * @return 单例类的实现
     */
	private SecuritySystem() {
		this.state = DayState.getInstance();
		this.getClock();
	}
	
	/**
     * 检查是否有敌人并做出反应
     *
     */
	public void Check() {
		this.getClock();
		state.check();
	}
	
	/**
     * 主动发起进攻
     *
     */
	public void Attack() {
		this.getClock();
		state.attack();
	}
	
	/**
     * 改变当前状态
     *
     */
	public void changeState(State state) {
		this.state = state;
	}
	
	/**
     * 获取当前时间
     *
     */
	public void getClock() {
		int time = Director.getInstance().getCurrentTime();
		state.checkTime(this, time);
	}
	
}
