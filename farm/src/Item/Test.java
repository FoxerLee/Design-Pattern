package src.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Test {
    public static void main(String[]args){

        //测试装饰者模式
        Facility cf=new House("test1");
        cf=new Awning(cf);
        cf=new Fence(cf);
        cf.getDescription();
        System.out.println();

        Facility f=new Kennel("test2");
        f=new Awning(f);
        f=new Fence(f);
        f.getDescription();
        System.out.println();


        Facility c=new Sheepfold("test3");
        c=new Awning(c);
        c=new Fence(c);
        c.getDescription();
        System.out.println();

        // 测试适配器模式
        Desklamp desklamp=new Desklamp();
        Farmland fa=new Farmland("Advanced land");
        fa.turnOn(fa);
        fa.turnOff(fa);

    }
}
