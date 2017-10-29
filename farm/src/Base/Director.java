package Dtor;

public class Director {
	static private Director director;
	private Command[] commandLists = new Command[20];
	private ConcreteIterator container;
	private int commandNum;
	private Director() {
		commandNum = 0;
		commandLists[commandNum++] = new AccelerateCommand();
		commandLists[commandNum++] = new SlowCommand();
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

    private Scene () {
        container = new ConcreteIterator();
    }
    // 获取当前的场景
    public static Scene getScene() {
        return scene;
    }

}
