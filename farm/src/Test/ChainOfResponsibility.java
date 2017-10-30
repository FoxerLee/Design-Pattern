package src.Test;

import src.Item.Building.House;
import src.Item.Building.Kennel;
import src.Item.Building.Sheepfold;
import src.Item.Facilities.*;


/**
 * 责任链模式测试类
 * 当调用抵押请求时，根据请求的金额和责任链的顺序来决定抵押列表
 * @author bingjieyang
 * @version 2017/10/30
 **/
public class ChainOfResponsibility {
    public static void main(String[] args){
        //测试责任链模式
        ConcreteFacility cf0=new Farmland("test5");
        cf0.setValue(100);

        ConcreteFacility cf1=new House("test6");
        cf1.setValue(600);

        ConcreteFacility cf2=new Kennel("test7");
        cf2.setValue(200);

        ConcreteFacility cf3=new Sheepfold("test8");
        cf3.setValue(900);

        //设置责任链
        cf0.setSuccessor(cf1);
        cf1.setSuccessor(cf2);
        cf2.setSuccessor(cf3);

        //处理请求
        cf0.mortgage(50);
        System.out.println();
        cf0.mortgage(1000);
        System.out.println();
        cf0.mortgage(130);
        System.out.println();
        cf0.mortgage(800);
        System.out.println();
        cf0.mortgage(3000);
        System.out.println();
    }

}
