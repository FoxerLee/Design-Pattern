package src.Clock;
/**
 * ÊµÏÖÃüÁîÀà
 * @version 2017/10/26
 * @author LiMianHong
 */
abstract public class Command {
	public void execute() {
		mementoList[numCommands] = Clock.getInstance().createMemento();
		commandList[numCommands] = this;
		if(numCommands > highWater) {
			highWater = numCommands;
		}
		numCommands++;
		runAction();
	}
	abstract public void runAction();
	
	static private Command[] commandList = new Command[20];
	static private Memento[] mementoList = new Memento[20];
	static private int numCommands;
	static private int highWater;
	
	static public void undo() {
		if(numCommands == 0) {
			System.out.println("Not enough commands");
			return;
		}
		Clock.getInstance().reinstateMemento(mementoList[numCommands - 1]);
		numCommands--;
	}
	
	static public void redo() {
		if(numCommands > highWater) {
			System.out.println("Not enough commands");
			return;
		}
		commandList[numCommands].runAction();
		numCommands++;
	}
	
}
