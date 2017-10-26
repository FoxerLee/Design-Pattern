package src.Test;

import src.Action.HarvestFactory.FactoryProducer;
import src.Item.Fertilizer;
import src.Plant.Seeds;

public class AbstractFactory {
    public static void main(String [] args){
        src.Action.HarvestFactory.AbstractFactory abstractFactory = FactoryProducer.getFactory(2);
        Seeds seed1 = abstractFactory.getSeed("Corn");
        Seeds seed2 = abstractFactory.getSeed("Rice");
        Seeds seed3 = abstractFactory.getSeed("Wheat");
        System.out.println(seed1.Grow().getName() + ", " + seed1.Grow().getLifeState() + ", growth value : " + seed1.Grow().getGrowthValue());
        System.out.println(seed2.Grow().getName() + ", " + seed2.Grow().getLifeState() + ", growth value : " + seed2.Grow().getGrowthValue());
        System.out.println(seed3.Grow().getName() + ", " + seed3.Grow().getLifeState() + ", growth value : " + seed3.Grow().getGrowthValue());

        src.Action.HarvestFactory.AbstractFactory abstractFactory2 = FactoryProducer.getFactory(1);
        Fertilizer fertilizer = abstractFactory2.getFertilizer(1);
    }
}