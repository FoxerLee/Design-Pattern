package src.Action.HarvestFactory;

import src.Item.Fertilizer;
import src.Item.Fertilizering.InorganicFertilizer;
import src.Item.Fertilizering.OrganicFertilizer;
import src.Plant.Seeds;

/**
 * 化肥生产工厂，继承了抽象工厂类
 * 可以生产化肥而生产不了种子
 */
public class FertilizerAbstractFactory extends AbstractFactory {
    /**
     * 无法生产种子
     * @param seed
     * @return
     */
    @Override
    public Seeds getSeed(String seed) {
        return null;
    }

    /**
     * 可以生产无机/有机化肥
     * @param type
     * @return
     */
    @Override
    public Fertilizer getFertilizer(int type) {
        if(type == 1){
            return new InorganicFertilizer();
        }
        else if(type == 2){
            return new OrganicFertilizer();
        }
        else
            return null;
    }
}
