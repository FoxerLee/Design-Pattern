package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public abstract class Building extends ConcreteFacility {


    /**
     * 建筑的名称
     * @param name
     * 容量
     * @param capacity
     */
    public Building(String name, int capacity) {
        super(name, capacity);
        desklamp=new Desklamp();
    }

    /**
     * 建筑的名称
     * @param name
     */
    public Building(String name) {
        super(name);
        desklamp=new Desklamp();
    }

    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {
        System.out.print("");
    }

    /**
     * 开灯
     * 调用开灯的建筑
     * @param concreteFacility
     */
    public void turnOn(ConcreteFacility concreteFacility){
        desklamp.turnOn(this);
    }

    /**
     * 关灯
     * 调用关灯的建筑
     * @param concreteFacility
     */
    public void turnOff(ConcreteFacility concreteFacility){
        desklamp.turnOff(this);
    }

    /**
     * 建筑所安装的灯
     */
    private Desklamp desklamp;
}
