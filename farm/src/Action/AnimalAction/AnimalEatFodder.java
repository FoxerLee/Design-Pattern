package src.Action.AnimalAction;

import src.Base.LifeStatement;
import src.Plant.PlantForEating.PlantToEat;
/**
 * 继承自AnimalEatFood抽象类：动物爱吃饲料
 */

public class AnimalEatFodder extends AnimalEatFood{
    /**
     * 构造函数
     * @param plant
     */
    public AnimalEatFodder(PlantToEat plant){
        super(plant);
    }


    /**
     * 匹配被吃的植物和动物的喜好
     * 若一致，则动物爱吃，若不一致，则动物gg
     * @return
     */
    @Override
    protected boolean doSomething() {
        System.out.println("\n" + getDescription());
        if(plant.getLifeState() == LifeStatement.MATURE){
            if(plant.getPlantType() == 1){
                System.out.println("It doesn't likes eating natural food, but it accept to eat it!");
            }
            else if(plant.getPlantType() == 2){
                System.out.println("It likes fodder very much and eat all of the food!");
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
    protected String getDescription() {
        return "Animal Type: " + "animal for fodder" + ". Plant type: " + plant.getName() + ", status: " + plant.getLifeState();
    }
}
