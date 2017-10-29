package src.Clock;
/**
 * 实现加快时间流速的命令
 * @version 2017/10/26
 * @author LiMianHong
 */
public class AccelerateCommand extends Command{
	public void runAction() {
		Clock.getInstance().accelerate();
	}
}
