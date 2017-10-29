package src.Security;
/**
 * 状态接口
 * @version 2017/10/26
 * @author LiMianHong
 */
public interface State {
	//检测是否存在敌人并做出反应
	abstract public void check();
	//主动发起攻击
	abstract public void attack();
	//检查当前时间并判断是否需要切换状态
	abstract public void checkTime(SecuritySystem system,int time); 
}