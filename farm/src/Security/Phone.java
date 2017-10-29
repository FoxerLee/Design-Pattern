package src.Security;
/**
 * 实现报警
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Phone {
	private String phoneNumber;
	
	public Phone() {
		this.phoneNumber = "110";
	}
	
	public Phone(String str) {
		this.phoneNumber = str;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void run() {
		System.out.println("Calling " + phoneNumber);
	}
}
