package src.Item;

/**
 * @version 2017/10/26
 * @author  bingjieyang
 **/
public class Test {
    public static void main(String[]args){

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

        System.out.println();


        // 测试适配器模式
        Desklamp desklamp=new Desklamp();
        Farmland f4=new Farmland("test4");
        f4.turnOn(f4);
        f4.turnOff(f4);

        System.out.println();


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
