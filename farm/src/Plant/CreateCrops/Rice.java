package src.Plant.CreateCrops;

import src.Base.LifeStatement;
import src.Base.Plant;
import src.Plant.Seeds;

public class Rice implements Seeds {

    /**
     * 返回的植物名称为Rice，状态为正在生长，生长值为0
     * @return
     */
    @Override
    public Plant Grow() {
        return new Plant("Rice", LifeStatement.GROWING,0);
    }
}
