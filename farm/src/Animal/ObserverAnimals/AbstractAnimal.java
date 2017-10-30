package src.Animal.ObserverAnimals;

import src.Action.ObserverAction.Operation;
import src.Base.Animal;

/**
 * 观察者模式的抽象接口
 */
public class AbstractAnimal extends Animal{

    /**
     * 定义动作，将特定动作绑在动物身上
     */
    private Operation operation;

    /**
     * 定义动物的三种状态：体力，健康和交易价值
     * @param breeding
     * @param health
     * @param operation
     */
    public  AbstractAnimal(int breeding, int health, Operation operation){
        setBreeding(breeding);
        setHealth(health);
        setMarketValue((float)(breeding * 0.5 + health * 0.5));
        operation.addAnimal(this);
    }

    @Override
    public void move() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

}
