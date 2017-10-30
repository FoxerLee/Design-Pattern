package src.Clock;
/**
 * 减速时间流速命令实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class SlowCommand extends Command{
	//实现减速命令
	public void runAction() {
		Clock.getInstance().slow();	
	}
}
