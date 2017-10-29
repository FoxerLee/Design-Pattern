package src.Plant.CreateCrops;

import src.Base.LifeStatement;
import src.Base.Plant;
import src.Plant.Seeds;

public class Corn implements Seeds {
    /**
     * 返回的植物名称为Corn，状态为正在生长，生长值为0
     * @return
     */
    public Plant Grow(){
        return new Plant("Corn", LifeStatement.GROWING,0);
    }
}
