package src.Security;
/**
 * ʵ��ս��ϵͳ
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Fight {
	private String friend;
	
	
	public Fight() {
		this.friend = "dog1";
	}
	
	public Fight(String friend) {
		this.friend = friend;
	}
	
	public void setFriend(String friend) {
		this.friend = friend;
	}
	
	public String getFriend() {
		return this.friend;
	}
	
	public void run() {
		System.out.println("we fight the enemy with " + friend );
	}
}
