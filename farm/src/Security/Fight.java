package src.Security;
/**
 * 战斗系统实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Fight {
	private String friend;
	
	
	public Fight() {
		this.friend = "dog1";
	}
	
	/**
     * 设置战斗伙伴
     *
     * @param friend 战斗伙伴
     *
     */
	public Fight(String friend) {
		this.friend = friend;
	}
	
	/**
     * 设置战斗伙伴
     *
     * @param friend 战斗伙伴
     *
     */
	public void setFriend(String friend) {
		this.friend = friend;
	}
	
	/**
     * 获取战斗伙伴
     *
     * @return 战斗伙伴
     *
     */
	public String getFriend() {
		return this.friend;
	}
	
	/**
     * 运行战斗系统
     *
     */
	public void run() {
		System.out.println("we fight the enemy with " + friend );
	}
}
