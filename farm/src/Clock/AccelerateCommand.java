package Dtor;

public class AccelerateCommand extends Command{
	public void runAction() {
		Clock.getInstance().accelerate();
	}
}
