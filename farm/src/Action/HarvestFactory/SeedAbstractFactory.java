package src.Action.HarvestFactory;

import src.Item.Fertilizer;
import src.Plant.CreateCrops.Corn;
import src.Plant.CreateCrops.Rice;
import src.Plant.CreateCrops.Wheat;
import src.Plant.Seeds;

/**
 * 种子抽象工厂类，继承了抽象工厂类
 * 可以生产三种类型的种子
 */
public class SeedAbstractFactory extends AbstractFactory {
    /**
     * 可以生产玉米，水稻和小麦种子
     * @param seed
     * @return
     */
    @Override
    public Seeds getSeed(String seed) {
        if(seed == "Corn"){
            return new Corn();
        }
        else if(seed == "Rice"){
            return new Rice();
        }
        else if(seed == "Wheat"){
            return new Wheat();
        }
        else
            return null;
    }

    @Override
    public Fertilizer getFertilizer(int type) {
        return null;
    }
}
