package src.Plant.CreateCrops;

import src.Base.LifeStatement;
import src.Base.Plant;
import src.Plant.Seeds;

public class Corn implements Seeds {
    String name;
    public Plant Grow(){
        return new Plant("Corn", LifeStatement.GROWING,0);
    }
}
