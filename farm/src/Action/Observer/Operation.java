package src.Action.Observer;

import src.Animal.ObserverAnimals.AbstractAnimal;
import src.Base.Action;
import src.Base.Animal;

import java.util.ArrayList;

/**
 * 定义了一系列动作，并将动物加到广播队列里
 */
public class Operation extends Action{

    /**
     * 被“通知”的动物列表
     */
    protected ArrayList<AbstractAnimal> animals;

    public Operation(){
        super();
        animals = new ArrayList<>();
    }

    /**
     * 添加动物
     * @param animal
     */
    public void addAnimal(AbstractAnimal animal){
        animals.add(animal);
    }

    /**
     * 清空动物列表
     * @return
     */
    public boolean clearAnimals(){
        animals.clear();
        return true;
    }

    @Override
    protected boolean doSomething() {
        return false;
    }

    /**
     * 获得动物列表中所有动物的简要信息
     * @return
     */
    @Override
    protected String getDescription() {
        String response = new String();
        for(AbstractAnimal abstractAnimal : animals){
            response += "Name: " + abstractAnimal.getName() +
                    ", Health: " + abstractAnimal.getHealth() +
                    ", Breeding: " + abstractAnimal.getBreeding() +
                    ", Value: " + abstractAnimal.getMarketValue() + "\n";
        }
        return response;
    }

    /**
     * 给所有动物体检，健康值加5
     * @return
     */
    public boolean exanmin() {
        System.out.println("Examine the animals, and their health value will be improved by 5");
        for(Animal a : animals)
            if(a.getHealth() < 95)
                a.setHealth(a.getHealth() + 5);
            else
                a.setHealth(100);
        return true;
    }

    /**
     * 交易评估
     * 健康值的1/2加上生命值的1/2
     * @return
     */
    public boolean sell() {
        System.out.println("Now you want to sell them. Their value will be evaluated by their health and breeding.");
        for(Animal a : animals)
            a.setMarketValue((float)(a.getHealth() * 0.5 + a.getBreeding() * 0.5));
        return true;
    }

    /**
     * 给动物吃东西增加体力值
     * @return
     */
    public boolean takeFood() {
        System.out.println("Take Food! and animals will be energetic !");
        for(Animal a : animals){
            if(a.getBreeding() < 95)
                a.setBreeding(a.getBreeding() + 5);
            else
                a.setBreeding(100);
        }
        return true;
    }

    /**
     * 显示动物细节描述
     */
    public void showDetail(){
        System.out.println(getDescription());
    }
}
