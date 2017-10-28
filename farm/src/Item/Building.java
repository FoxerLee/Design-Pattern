package src.Item;

/**
 * 建筑类
 * @version 2017/10/26
 * @author bingjieyang
 **/
public abstract class Building extends ConcreteFacility {


    /**
     *
     * @param name 建筑的名称
     *
     * @param capacity 容量
     */
    public Building(String name, int capacity) {
        super(name, capacity);
        desklamp=new Desklamp();
    }

    /**
     *
     * @param name 建筑的名称
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
     *
     * @param concreteFacility 调用开灯的建筑
     */
    public void turnOn(ConcreteFacility concreteFacility){
        desklamp.turnOn(this);
    }

    /**
     * 关灯
     *
     * @param concreteFacility 调用关灯的建筑
     */
    public void turnOff(ConcreteFacility concreteFacility){
        desklamp.turnOff(this);
    }

    /**
     * 建筑所安装的灯
     */
    private Desklamp desklamp;
}
