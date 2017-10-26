package src.Action.HarvestFactory;

import src.Item.Fertilizer;
import src.Item.Fertilizering.InorganicFertilizer;
import src.Item.Fertilizering.OrganicFertilizer;
import src.Plant.Seeds;

public class FertilizerAbstractFactory extends AbstractFactory {
    @Override
    public Seeds getSeed(String seed) {
        return null;
    }

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
