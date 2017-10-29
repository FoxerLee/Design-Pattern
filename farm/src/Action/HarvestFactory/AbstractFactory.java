package src.Action.HarvestFactory;

import src.Item.Fertilizer;
import src.Plant.Seeds;

/**
 * AbstractFactory定义了一个抽象类，可以获得生产种子或生产化肥的方法
 */
public abstract class AbstractFactory {

    /**
     * 根据种子的名字来获取种子的实例
     * @param seed
     * @return
     */
    public abstract Seeds getSeed(String seed);

    /**
     * 根据肥料的种类1或2获取有机化肥或者无机化肥
     * @param type
     * @return
     */
    public abstract Fertilizer getFertilizer(int type);
}
