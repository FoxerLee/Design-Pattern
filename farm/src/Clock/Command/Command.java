package src.Clock.Command;

import src.Clock.Clock;
import src.Clock.Memento;

/**
 * 命令系统实现
 * @version 2017/10/26
 * @author LiMianHong
 */
abstract public class Command {
	//执行当前命令
	public void execute() {
		mementoList[numCommands] = Clock.getInstance().createMemento();
		commandList[numCommands] = this;
		if(numCommands > highWater) {
			highWater = numCommands;
		}
		numCommands++;
		runAction();
	}
	
	//当前命令的具体操作，由子类实现
	abstract public void runAction();
	
	//已执行过的命令表，用于redo
	static private Command[] commandList = new Command[20];
	//执行每个命令前的备忘录，用于undo
	static private Memento[] mementoList = new Memento[20];
	//当前状态所对应的命令表的所以
	static private int numCommands;
	//命令表的总大小
	static private int highWater;
	
	//恢复至上一次命令执行前的状态
	static public void undo() {
		if(numCommands == 0) {
			System.out.println("Not enough commands");
			return;
		}
		Clock.getInstance().reinstateMemento(mementoList[numCommands - 1]);
		numCommands --;
	}
	
	//恢复至上一次执行命令撤销前的状态
	static public void redo() {
		if(numCommands > highWater) {
			System.out.println("Not enough commands");
			return;
		}
		commandList[numCommands].runAction();
		numCommands++;
	}
	
}
