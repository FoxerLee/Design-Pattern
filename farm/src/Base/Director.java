package src.Base;
import src.Clock.*;
import src.Item.*;

/**
 * 导演类实现
 * @version 2017/10/29
 * @author LiMianHong
 */

public class Director {
	//单例类的引用
	static private Director director;
	//保存Director所能调用的命令
	private Command[] commandLists = new Command[20];
	//保存场景中的建筑
	private MyList<ConcreteFacility> container;
	//记录所拥有的命令的数量
	private int commandNum;
	//初始化命令集
	private Director() {
		commandNum = 0;
		commandLists[commandNum++] = new AccelerateCommand();
		commandLists[commandNum++] = new SlowCommand();
		commandLists[commandNum++] = new TimeGoseByCammand();
		container = new MyList<ConcreteFacility>();
	}
	/**
     * 获得当前时间流速
     *
     * @return 当前时间流速
     */
	static public int getTimeSpeed() {
		return Clock.getInstance().getTimeSpeed();
	}
	
	/**
     * 获得单例类Director的实例
     *
     * @return Director的实例
     */
	static public Director getInstance() {
		if( director == null ) {
			director = new Director();
		}
		return director;
	} 
	
	/**
     * 减缓时间流速
     *
     */
	public void slowTimeSpeed() {
		commandLists[1].execute();
	}
	
	/**
     * 加快时间流速
     *
     */
	public void accelerateTimeSpeed() {
		commandLists[0].execute();
	}
	
	/**
     * 撤回上一步骤对时间的操作，包括加快、减慢时间流速与进入下一回合
     *
     */
	public void undoClockOperation() {
		Command.undo();
	}
	
	
	/**
     * 重做上一步骤对时间的撤回操作，包括加快、减慢时间流速与进入下一回合
     */
	public void redoClockOperation() {
		Command.redo();
	}
	
	/**
     * 获取当前时间
     *
     * @return 当前时间
     * 
     */
	public int getCurrentTime() {
		return Clock.getInstance().getCurrentTime();
	}
	
	/**
     * 进入下一回合
     *
     */
	public void nextRound() {
		commandLists[2].execute();
	}
	
	/**
     * 在场景中添加一个建筑物
     *
     */
	public void addBuilding(ConcreteFacility building) {
		container.add(building);
	}
	
	/**
     * 在场景中移除一个建筑物
     *
     * @param building 待移除的成员
     *
     */
	public void removeBuilding(ConcreteFacility building) {
		ConcreteIterator<ConcreteFacility> ite = container.getIterator();
		int temp = 0;
		while(ite.hasNext()) {
			if(ite.next() == building) {
				container.remove(temp);
			}
			++temp;
		}
	}
	
	/**
     * 输出当前场景中拥有的所有建筑物
     *
     * false 表示移除失败
     */
	public void printAllBuilding() {
		ConcreteIterator<ConcreteFacility> ite = container.getIterator();
		while(ite.hasNext()) {
			System.out.print(ite.next().getName() + "  ");
		}
		System.out.println();
	}
}
