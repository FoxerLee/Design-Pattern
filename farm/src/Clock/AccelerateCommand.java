package src.Clock;
/**
 * ʵ�ּӿ�ʱ�����ٵ�����
 * @version 2017/10/26
 * @author LiMianHong
 */
public class AccelerateCommand extends Command{
	public void runAction() {
		Clock.getInstance().accelerate();
	}
}
