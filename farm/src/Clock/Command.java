package Dtor;


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
	
	static Command[] commandList = new Command[20];
	static Memento[] mementoList = new Memento[20];
	static int numCommands;
	static int highWater;
	
	static void undo() {
		if(numCommands == 0) {
			System.out.println("Not enough commands");
			return;
		}
		Clock.getInstance().reinstateMemento(mementoList[numCommands - 1]);
		numCommands--;
	}
	
	static void redo() {
		if(numCommands > highWater) {
			System.out.println("Not enough commands");
			return;
		}
		commandList[numCommands].runAction();
		numCommands++;
	}
	
}
