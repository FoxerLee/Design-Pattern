package src.Test;

import src.Action.HarvestAction.FactoryProducer;
import src.Item.Props.Fertilizer;
import src.Plant.Seeds;

/**
 * 抽象工厂 测试类
 * 抽象工厂能批量产出许多具有相同类型的产品，与工厂模式不同的是，抽象工厂更注重于产品间具有的特殊的联系。
 * 例如本例中，为了产生种植用品，可以生产种子，同时也可以生产化肥
 */
public class AbstractFactory {
    public static void main(String [] args){
        src.Action.HarvestAction.AbstractFactory abstractFactory = FactoryProducer.getFactory(2);
        Seeds seed1 = abstractFactory.getSeed("Corn");
        Seeds seed2 = abstractFactory.getSeed("Rice");
        Seeds seed3 = abstractFactory.getSeed("Wheat");
        System.out.println(seed1.Grow().getName() + ", " + seed1.Grow().getLifeState() + ", growth value : " + seed1.Grow().getGrowthValue());
        System.out.println(seed2.Grow().getName() + ", " + seed2.Grow().getLifeState() + ", growth value : " + seed2.Grow().getGrowthValue());
        System.out.println(seed3.Grow().getName() + ", " + seed3.Grow().getLifeState() + ", growth value : " + seed3.Grow().getGrowthValue());

        src.Action.HarvestAction.AbstractFactory abstractFactory2 = FactoryProducer.getFactory(1);
        Fertilizer fertilizer1 = abstractFactory2.getFertilizer(1);
        Fertilizer fertilizer2 = abstractFactory2.getFertilizer(2);
        System.out.println("fertilizer Name: " + fertilizer1.getName() + "and value is: " + fertilizer1.getValue());
        System.out.println("fertilizer Name: " + fertilizer2.getName() + "and value is: " + fertilizer2.getValue());
    }
}