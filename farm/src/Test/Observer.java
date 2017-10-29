package src.Test;

import src.Action.Observer.Operation;
import src.Animal.ObserverAnimals.Chicken;
import src.Animal.ObserverAnimals.Rabbit;

/**
 * 观察者模式
 * 场景为：有一群鸡和兔子，它们有自己的体力，健康值和交易价值
 * 现在要对他们进行喂食，“体检”和价值评估三个动作
 * 可以通过观察者模式对他们进行被动的评估
 */
public class Observer {
    public static void main(String[] args){
        Operation operation = new Operation();

        Chicken chicken = new Chicken(20, 50, operation);
        Rabbit rabbit = new Rabbit(30, 60, operation);

        System.out.println("Chicken's health: " + chicken.getHealth());
        System.out.println("rabbit's stamina" + rabbit.getBreeding());
        operation.showDetail();
        operation.exanmin();
        operation.takeFood();
        System.out.println("Chicken's health: " + chicken.getHealth());
        System.out.println("rabbit's stamina" + rabbit.getBreeding());
    }
}
