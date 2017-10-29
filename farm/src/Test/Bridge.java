package src.Test;

import src.Action.AnimalEatFood.AnimalEatFodder;
import src.Action.AnimalEatFood.AnimalEatFood;
import src.Action.AnimalEatFood.AnimalEatNaturalFood;
import src.Base.LifeStatement;
import src.Plant.PlantForEating.FodderForAnimal;
import src.Plant.PlantForEating.NatureFoodForAnimal;

/**
 * 桥接模式测试类
 * 场景为不同动物吃植物或者饲料，可以看作 动物 吃 食物
 * 动物不同，食物不同，搭配起来的组合也就不同
 */
public class Bridge {
    public static void main(String[] args){
        AnimalEatFood action1 = new AnimalEatFodder(new FodderForAnimal("Fodder", LifeStatement.MATURE, 100));
        AnimalEatFood action2 = new AnimalEatNaturalFood(new FodderForAnimal("Fodder", LifeStatement.MATURE, 100));
        AnimalEatFood action3 = new AnimalEatFodder(new NatureFoodForAnimal("NaturalFood", LifeStatement.MATURE, 100));
        AnimalEatFood action4 = new AnimalEatNaturalFood(new NatureFoodForAnimal("NaturalFood", LifeStatement.MATURE, 100));
        action1.run();
        action2.run();
        action3.run();
        action4.run();
    }
}