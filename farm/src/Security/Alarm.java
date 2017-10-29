package src.Security;
/**
 * 警报系统
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Alarm {

	//警报等级
	private int level;
	
	public Alarm(){
		level = 0;
	}
	
	/**
	 * 设置警报等级
	 *
	 * @param 警报等级
	 */
	public Alarm(int level) {
		this.level = level;
	} 
	
   /**
    * 获取警报等级
    *
    * @return 警报等级
    */
	public int getLevel() {
		return level;
	}
	
	/**
	 * 设置警报等级
	 *
	 * @param 警报等级
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	
	/**
	 * 运行警报系统
	 *
	 */
	public void run() {
		if(level < 1) {
			System.out.println("send out a alarm");
		}
		else {
		System.out.println("Send out a loud alarm");
		}
	}
}
