package src.Plant.PlantForEating;

import src.Base.LifeStatement;

/**
 * 设置饲料，食物类型为2
 */
public class FodderForAnimal extends PlantToEat {
    public FodderForAnimal(String name, LifeStatement lifeStatement, int growthValue){
        super(name, lifeStatement, growthValue);
        setPlantType(2);
    }
}
