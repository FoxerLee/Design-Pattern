package src.Plant.PlantForEating;

import src.Base.*;

/**
 * 定义被动物吃的植物以及相关信息
 */
public abstract class PlantToEat extends Plant{

    /**
     * 植物类型
     */
    private int plantType;

    /**
     * 构造函数
     * 生成要动物吃的植物
     * @param name
     * @param lifeStatement
     * @param growthValue
     */
    public PlantToEat(String name, LifeStatement lifeStatement, int growthValue){

        ////////////////////////////
        super(name,lifeStatement , growthValue);
        plantType = -1; //未定义
    }

    /**
     * 返回植物类型
     * @return
     */
    public int getPlantType() {
        return plantType;
    }

    /**
     * 设置植物类型
     * @param plantType
     */
    public void setPlantType(int plantType) {
        this.plantType = plantType;
    }


}
