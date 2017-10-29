package src.Security;
/**
 * 报警系统实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class Phone {
	//报警号码
	private String phoneNumber;
   /**
    * 构造函数
    */
	public Phone() {
		this.phoneNumber = "110";
	}
	
   /**
	* @param 报警号码
	*/
	public Phone(String str) {
		this.phoneNumber = str;
	}
	
	/**
     * 获取报警号码
     *
     * @return 报警号码
     */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
     * 设置报警号码
     *
     * @param 报警号码
     */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
     * 运行报警系统
     *
     */
	public void run() {
		System.out.println("Calling " + phoneNumber);
	}
}
