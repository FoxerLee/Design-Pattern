package src.Clock.Command;

import src.Clock.Clock;
import src.Clock.Command.Command;

/**
 * 时间增加命令实现
 * @version 2017/10/26
 * @author LiMianHong
 */
public class TimeGoseByCommand extends Command {
	//运行时间增加命令
	public void runAction() {
		Clock.getInstance().timeGoseBy();
	}
}
