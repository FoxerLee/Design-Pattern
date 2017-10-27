package src.Action.AnimalEatFood;

import src.Base.LifeStatement;
import src.Plant.PlantForEating.PlantToEat;

public class AnimalEatNaturalFood extends AnimalEatFood {
    public AnimalEatNaturalFood(PlantToEat plant){
        super(plant);
    }

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

    @Override
    public String getDescription() {
        return "Animal Type: " + "animal for natural food" + ". Plant type: " + plant.getName() + ", status: " + plant.getLifeState();
    }
}
