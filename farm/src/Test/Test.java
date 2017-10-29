package src.Test;

import src.Action.AnimalEatFood.AnimalEatFodder;
import src.Action.AnimalEatFood.AnimalEatFood;
import src.Action.AnimalEatFood.AnimalEatNaturalFood;
import src.Action.HarvestFactory.FactoryProducer;
import src.Action.Observer.Operation;
import src.Action.PersonAction.PersonAction;
import src.Action.PersonAction.PersonSleep;
import src.Action.PersonAction.PersonWateringPlant;
import src.Action.PersonAction.Proxy.ProxyPersonEatFood;
import src.Animal.ObserverAnimals.Chicken;
import src.Animal.ObserverAnimals.Rabbit;
import src.Base.LifeStatement;
import src.Base.Person;
import src.Item.Fertilizer;
import src.Item.Shopping.ShoppingList;
import src.Item.Shopping.StocksBuilder;
import src.Plant.PlantForEating.FodderForAnimal;
import src.Plant.PlantForEating.NatureFoodForAnimal;
import src.Plant.Seeds;

/**
 * Created by chenhui on 2017/10/29.
 */
public class Test {
    public static void main(String[] args){
        /**
         * 抽象工厂例子
         */
        System.out.println("emm，今天我们收购了一家农场, 但我们什么都没有。 所以我们来买一波种子和肥料：");
        src.Action.HarvestFactory.AbstractFactory abstractFactory = FactoryProducer.getFactory(2);
        Seeds seed1 = abstractFactory.getSeed("Corn");
        Seeds seed2 = abstractFactory.getSeed("Rice");
        Seeds seed3 = abstractFactory.getSeed("Wheat");
        System.out.println("种子:\n" + seed1.Grow().getName() + ", " + seed1.Grow().getLifeState() + ",成长值 : " + seed1.Grow().getGrowthValue());
        System.out.println(seed2.Grow().getName() + ", " + seed2.Grow().getLifeState() + ", 成长值 : " + seed2.Grow().getGrowthValue());
        System.out.println(seed3.Grow().getName() + ", " + seed3.Grow().getLifeState() + ", 成长值 : " + seed3.Grow().getGrowthValue());
        src.Action.HarvestFactory.AbstractFactory abstractFactory2 = FactoryProducer.getFactory(1);
        Fertilizer fertilizer1 = abstractFactory2.getFertilizer(1);
        Fertilizer fertilizer2 = abstractFactory2.getFertilizer(2);
        System.out.println("肥料:\n" +  fertilizer1.getName() + ", and value is: " + fertilizer1.getValue());
        System.out.println(fertilizer2.getName() + ", and value is: " + fertilizer2.getValue());
        System.out.println("\n\n");

        /**
         * builder例子
         */
        System.out.println("此时我们得知，在伊利诺伊和墨西有种子和动物的套餐。我们点了一份套餐二：");
        StocksBuilder builder = new StocksBuilder();
        ShoppingList list2 = builder.Set2();
        list2.ShowItems();
        System.out.println("And the total price is " + list2.getTotalCost());
        System.out.println("\n\n");

        /**
         * observer例子
         */
        System.out.println("现在我们买回来一直兔子，一只鸡。现在他们又饿又生了病，我需要照顾他们：");
        Operation operation = new Operation();
        Chicken chicken = new Chicken(0, -1, operation);
        Rabbit rabbit = new Rabbit(0, -1, operation);
        System.out.println("Chicken's health: " + chicken.getHealth());
        System.out.println("rabbit's stamina " + rabbit.getBreeding());
        System.out.println("给他们喂食，体检以后：");
        operation.showDetail();
        operation.exanmin();
        operation.takeFood();
        System.out.println("Chicken's health: " + chicken.getHealth());
        System.out.println("rabbit's stamina " + rabbit.getBreeding());

        /**
         *Bridge例子
         */
        System.out.println("现在鸡和兔子在茁壮成长，而你现在有有机私聊和天然植物。你把这些食物喂给们：");
        AnimalEatFood action1 = new AnimalEatFodder(new FodderForAnimal("Fodder", LifeStatement.MATURE, 100));
        AnimalEatFood action2 = new AnimalEatNaturalFood(new FodderForAnimal("Fodder", LifeStatement.MATURE, 100));
        AnimalEatFood action3 = new AnimalEatFodder(new NatureFoodForAnimal("NaturalFood", LifeStatement.MATURE, 100));
        AnimalEatFood action4 = new AnimalEatNaturalFood(new NatureFoodForAnimal("NaturalFood", LifeStatement.MATURE, 100));
        System.out.println("鸡爱吃饲料，你喂给它饲料：");
        action1.run();
        System.out.println("兔子爱吃植物，你喂给它饲料：");
        action2.run();
        System.out.println("鸡爱吃植物，你喂给它植物：");
        action3.run();
        System.out.println("兔子爱吃植物，你喂给它植物：");
        action4.run();

        /**
         * proxy例子
         * Jack 吃食物会恢复体力
         * 浇水会消耗体力值
         * 体力值耗尽就会生病，无法工作
         * 体力值达到上限就无需进食
         */
        System.out.println(" ");
        Person Jack = new Person("Jack", 1);
        PersonAction JackEatFood = new ProxyPersonEatFood(Jack);
        PersonAction JackWateringPlant = new PersonWateringPlant(Jack);
        JackWateringPlant.run();
        JackEatFood.run();
        JackEatFood.run();
        JackEatFood.run();
        JackEatFood.run();



        /**
         * PersonState例子
         * Jack睡觉也会恢复体力值
         */
        PersonAction JackSleep = new PersonSleep(Jack);
        JackWateringPlant.run();
        JackWateringPlant.run();
        JackSleep.run();
        JackWateringPlant.run();
        JackWateringPlant.run();
        JackSleep.run();
        JackSleep.run();
        JackSleep.run();
        JackWateringPlant.run();
    }
}
