package Dtor;

public class SlowCommand extends Command{
	public void runAction() {
		Clock.getInstance().slow();	
	}
}
