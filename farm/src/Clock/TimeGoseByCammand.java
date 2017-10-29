package src.Clock;
/**
 * 时间增加命令实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class TimeGoseByCammand extends Command{
	//运行时间增加命令
	public void runAction() {
		Clock.getInstance().timeGoseBy();;
	}
}
