package src.Base;
import src.Clock.*;

/**
 * 实现导演类
 * @version 2017/10/26
 * @author LiMianHong
 */

public class Director {
	static private Director director;
	private Command[] commandLists = new Command[20];
	private ConcreteIterator container;
	private int commandNum;
	private Director() {
		commandNum = 0;
		commandLists[commandNum++] = new AccelerateCommand();
		commandLists[commandNum++] = new SlowCommand();
		container = new ConcreteIterator();
	}
	
	static public int getTimeSpeed() {
		return Clock.getInstance().getTimeSpeed();
	}
	
	static public Director getInstance() {
		if( director == null ) {
			director = new Director();
		}
		return director;
	} 
	public void slowTimeSpeed() {
		commandLists[1].execute();
	}
	
	public void accelerateTimeSpeed() {
		commandLists[0].execute();
	}
	
	public void undoTimeSpeed() {
		Command.undo();
	}
	
	public void redoTimeSpeed() {
		Command.redo();
	}

}
