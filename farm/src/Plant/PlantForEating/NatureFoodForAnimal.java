package src.Plant.PlantForEating;

import src.Base.LifeStatement;

/**
 * 设置天然植物
 * 返回的植物类型为1
 */
public class NatureFoodForAnimal extends PlantToEat {
    public NatureFoodForAnimal(String name, LifeStatement lifeStatement, int growthValue){
        super(name, lifeStatement, growthValue);
        setPlantType(1);
    }
}
