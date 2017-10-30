package src.Action.AnimalAction;

import src.Base.LifeStatement;
import src.Plant.PlantForEating.PlantToEat;

/**
 * 继承自AnimalEatFood抽象类：动物爱吃天然植物
 */
public class AnimalEatNaturalFood extends AnimalEatFood {
    /**
     * 构造函数
     * @param plant
     */
    public AnimalEatNaturalFood(PlantToEat plant){
        super(plant);
    }

    /**
     * 匹配被吃的植物和动物的喜好
     * 若一致，则动物爱吃，若不一致，则动物gg
     * @return
     */
    @Override
    public boolean doSomething() {
        System.out.println("\n" + getDescription());
        if(plant.getLifeState() == LifeStatement.MATURE){
            if(plant.getPlantType() == 1){
                System.out.println("It likes eating natural food, it is very pleasant!");
            }
            else if(plant.getPlantType() == 2){
                System.out.println("It doesn't like eating fodder, so it refuse to eat the food...");
            }
            return true;
        }
        else
            System.out.println("plant isn't mature, you cannot eat it!");
        return false;
    }

    /**
     * 输出动物状态信息
     * @return
     */
    @Override
    public String getDescription() {
        return "Animal Type: " + "animal for natural food" + ". Plant type: " + plant.getName() + ", status: " + plant.getLifeState();
    }
}
