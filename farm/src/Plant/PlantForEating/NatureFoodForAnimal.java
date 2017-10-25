package src.Plant.PlantForEating;

import src.Base.LifeStatement;

public class NatureFoodForAnimal extends PlantToEat {
    public NatureFoodForAnimal(String name, LifeStatement lifeStatement, int growthValue){
        super(name, lifeStatement, growthValue);
        setPlantType(1);
    }
}
