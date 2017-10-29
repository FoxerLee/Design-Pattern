package src.Security;
/**
 * ÊµÏÖ×´Ì¬Àà
 * @version 2017/10/26
 * @author LiMianHong
 */
public interface State {
	abstract public void check();
	abstract public void attack();
	abstract public void checkTime(SecuritySystem system,int time); 
}