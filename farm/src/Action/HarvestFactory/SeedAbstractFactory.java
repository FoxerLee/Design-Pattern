package src.Action.HarvestFactory;

import src.Item.Fertilizer;
import src.Plant.CreateCrops.Corn;
import src.Plant.CreateCrops.Rice;
import src.Plant.CreateCrops.Wheat;
import src.Plant.Seeds;

public class SeedAbstractFactory extends AbstractFactory {
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
