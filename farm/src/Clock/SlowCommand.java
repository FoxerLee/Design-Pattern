package src.Clock;
/**
 * 实现降低时间流速的命令
 * @version 2017/10/26
 * @author LiMianHong
 */
public class SlowCommand extends Command{
	public void runAction() {
		Clock.getInstance().slow();	
	}
}
