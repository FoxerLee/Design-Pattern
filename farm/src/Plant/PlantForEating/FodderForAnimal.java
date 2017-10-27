package src.Plant.PlantForEating;

import src.Base.LifeStatement;

public class FodderForAnimal extends PlantToEat {
    public FodderForAnimal(String name, LifeStatement lifeStatement, int growthValue){
        super(name, lifeStatement, growthValue);
        setPlantType(2);
    }
}
