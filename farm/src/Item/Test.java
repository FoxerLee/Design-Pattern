package src.Item;

public class Test {
    public static void main(String[]args){


        CurrentFacility cf=new House("test", 100);
//        cf=new Fence(cf);
        System.out.println("Hello!");




        //测试装饰者模式
        Facility cf=new House("test");
        cf=new Awning(cf);
        cf=new Fence(cf);
        cf.getDescription();
        System.out.println();

        Facility f=new Kennel("test2");
        f=new Awning(f);
        f=new Fence(f);
        f.getDescription();
        System.out.println();


        Facility c=new House("test3");
        c=new Awning(c);
        c=new Fence(c);
        c.getDescription();
        System.out.println();

    }
}
