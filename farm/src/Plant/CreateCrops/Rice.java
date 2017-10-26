package src.Plant.CreateCrops;

import src.Base.LifeStatement;
import src.Base.Plant;
import src.Plant.Seeds;

public class Rice implements Seeds {
    @Override
    public Plant Grow() {
        return new Plant("Rice", LifeStatement.GROWING,0);
    }
}
