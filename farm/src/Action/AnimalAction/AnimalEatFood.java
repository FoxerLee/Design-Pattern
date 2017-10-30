package src.Action.AnimalAction;
import src.Base.Action;
import src.Plant.PlantForEating.PlantToEat;

/**
 * 桥接模式的吃的动作定义：动物爱吃植物
 * 此处淡化了动物的角色，重点放在动物爱吃的植物上
 * 两个子类：AnimalEatNaturalFood和AnimalEatFodder分别代表爱吃植物或者爱吃饲料
 */
public abstract class AnimalEatFood extends Action{
    /**
     * 定义被吃的植物
     */
    protected PlantToEat plant;

    /**
     * 获得植物
     * @return
     */
    public PlantToEat getPlant() {
        return plant;
    }

    /**
     * 定义植物
     * @param plant
     */
    public void setPlant(PlantToEat plant) {
        this.plant = plant;
    }

    /**
     * 定义一个动作：动物吃**类型的植物
     * @param plant
     */
    public AnimalEatFood(PlantToEat plant){
        this.plant = plant;
    }

    /**
     * 继承Action动作
     * @return
     */
    @Override
    protected boolean doSomething() {
        return false;
    }

    /**
     * 继承Action动作
     * @return
     */
    @Override
    protected String getDescription() {
        return null;
    }
}
