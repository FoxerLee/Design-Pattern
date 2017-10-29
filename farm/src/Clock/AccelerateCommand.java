package src.Clock;
/**
 * 加速命令实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class AccelerateCommand extends Command{
	//执行加速命令
	public void runAction() {
		Clock.getInstance().accelerate();
	}
}
