package src.Plant.CreateCrops;

import src.Base.LifeStatement;
import src.Base.Plant;
import src.Plant.Seeds;

public class Wheat implements Seeds {
    @Override
    public Plant Grow() {
        return new Plant("Wheat", LifeStatement.GROWING,0);
    }
}
