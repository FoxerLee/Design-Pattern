package src.Clock;
/**
 * ʵ�ֽ���ʱ�����ٵ�����
 * @version 2017/10/26
 * @author LiMianHong
 */
public class SlowCommand extends Command{
	public void runAction() {
		Clock.getInstance().slow();	
	}
}
