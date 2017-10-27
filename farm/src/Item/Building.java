package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Building extends ConcreteFacility {


    /**
     * 建筑的名称
     * @param name
     * 容量
     * @param capacity
     */
    public Building(String name, int capacity) {
        super(name, capacity);
    }

    /**
     * 建筑的名称
     * @param name
     */
    public Building(String name) {
        super(name);
    }

    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {
        System.out.print("");
    }

    public void turnOn(ConcreteFacility concreteFacility){
        desklamp.turnOn(this);
    }

    public void turnOff(ConcreteFacility concreteFacility){
        desklamp.turnOff(this);
    }

    private Desklamp desklamp;
}
