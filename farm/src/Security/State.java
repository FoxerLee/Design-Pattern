package src.Security;
/**
 * 实现状态类
 * @version 2017/10/26
 * @author LiMianHong
 */
public interface State {
	abstract public void check();
	abstract public void attack();
	abstract public void checkTime(SecuritySystem system,int time); 
}