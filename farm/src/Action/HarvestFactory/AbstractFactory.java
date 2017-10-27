package src.Action.HarvestFactory;

import src.Item.Fertilizer;
import src.Plant.Seeds;

public abstract class AbstractFactory {
    public abstract Seeds getSeed(String seed);
    public abstract Fertilizer getFertilizer(int type);
}
