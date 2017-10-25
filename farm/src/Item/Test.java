package src.Item;

/**
 * 测试类
 */
public class Test {
    public static void main(String[]args){
        Facility cf=new House("test");
        cf=new Awning(cf);
        cf=new Fence(cf);
        cf.getDescription();
    }
}
