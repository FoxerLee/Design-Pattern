package src.Test;

import src.Item.Building.House;
import src.Item.Building.Kennel;
import src.Item.Building.Sheepfold;
import src.Item.Decorator.Awning;
import src.Item.Decorator.Fence;
import src.Item.Facilities.Facility;

/**
 * 装饰者模式测试类
 * Farmland或者House、Kennel、Sheephold等ConcreteFacility的子类可以
 * 被Decorator的子类如Awning、Fence等装饰
 * @author bingjieyang
 * @version 2017/10/30
 **/
public class Decorator {
    public static void main(String []args){
        //测试装饰者模式
        Facility f0=new House("test0");
        f0=new Awning(f0);
        f0=new Fence(f0);
        f0.getDescription();
        System.out.println();

        Facility f1=new House("test1");
        f1=new Awning(f1);
        f1=new Fence(f1);
        f1.getDescription();
        System.out.println();

        Facility f2=new Kennel("test2");
        f2=new Awning(f2);
        f2=new Fence(f2);
        f2.getDescription();
        System.out.println();


        Facility f3=new Sheepfold("test3");
        f3=new Awning(f3);
        f3=new Fence(f3);
        f3.getDescription();
        System.out.println();

    }
}
