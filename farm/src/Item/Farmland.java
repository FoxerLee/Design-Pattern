package src.Item;

import src.Base.Plant;

/**
 * 土地类
 * @version 2017/10/26
 * @author bingjieyang
 *
 *
 */
public class Farmland extends ConcreteFacility {

    /**
     *
     * @param name 土地名称
     *
     * @param capacity 土地容量
     */
    public Farmland(String name, int capacity) {

        super(name, capacity);

        // 适配器模式
        Desklamp desklamp=new Desklamp();
        lamppost=new Adapter(desklamp);

    }

    /**
     *
     * @param name 土地名称
     */
    public Farmland(String name) {

        super(name,10);
        // 适配器模式
        Desklamp desklamp=new Desklamp();
        lamppost=new Adapter(desklamp);
    }

    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {

        System.out.print(getName());
    }


    /**
     *种植植物
     *
     * @param plant 被种植的植物
     *
     * @return 返回true表示种植成功，false表示失败
     */
    public boolean addLodger(Plant plant){
        check(plant);
        return addLodger(plant);
    }

    /**
     *移除植物
     *
     * @param plant 被移除的植物
     *
     * @return 返回true表示移除成功，false表示移除失败
     */
    public boolean removeLodger(Plant plant){

        return removeLodger(plant);
    }

    /**
     * 开灯
     * 适配器模式接口的使用
     *
     * @param concreteFacility 调用开灯的基础设施
     */
    public void turnOn(ConcreteFacility concreteFacility){
        lamppost.turnOn(concreteFacility);
    }

    /**
     * 关灯
     * 适配器模式接口的使用
     *
     * @param concreteFacility 调用关灯的基础设施
     */
    public void turnOff(ConcreteFacility concreteFacility){
        lamppost.turnOff(concreteFacility);
    }

    /**
     * 适配器模式中提供的接口
     */
    private Lamppost lamppost;

}
