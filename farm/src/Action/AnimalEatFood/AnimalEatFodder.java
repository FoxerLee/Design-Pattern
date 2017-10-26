package src.Action.AnimalEatFood;

import src.Base.LifeStatement;
import src.Plant.PlantForEating.PlantToEat;

public class AnimalEatFodder extends AnimalEatFood{
    public AnimalEatFodder(PlantToEat plant){
        super(plant);
    }

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

    @Override
    protected String getDescription() {
        return "Animal Type: " + "animal for fodder" + ". Plant type: " + plant.getName() + ", status: " + plant.getLifeState();
    }
}
