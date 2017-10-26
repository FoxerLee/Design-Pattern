package src.Action.AnimalEatFood;
import src.Base.Action;
import src.Plant.PlantForEating.PlantToEat;

public abstract class AnimalEatFood extends Action{
    protected PlantToEat plant;

    public PlantToEat getPlant() {
        return plant;
    }

    public void setPlant(PlantToEat plant) {
        this.plant = plant;
    }

    public AnimalEatFood(PlantToEat plant){
        this.plant = plant;
    }

    @Override
    protected boolean doSomething() {
        return false;
    }

    @Override
    protected String getDescription() {
        return null;
    }
}
