package src.Test;

import src.Action.AnimalEatFood.AnimalEatFodder;
import src.Action.AnimalEatFood.AnimalEatFood;
import src.Action.AnimalEatFood.AnimalEatNaturalFood;
import src.Base.LifeStatement;
import src.Plant.PlantForEating.FodderForAnimal;
import src.Plant.PlantForEating.NatureFoodForAnimal;

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