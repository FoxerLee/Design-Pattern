package src.Plant.PlantForEating;

import src.Base.*;

public abstract class PlantToEat extends Plant{

    private int plantType;

    public PlantToEat(String name, LifeStatement lifeStatement, int growthValue){

        ////////////////////////////
        super(name,lifeStatement , growthValue);
        plantType = -1; //未定义
    }

    public int getPlantType() {
        return plantType;
    }

    public void setPlantType(int plantType) {
        this.plantType = plantType;
    }


}
