package src.Item;

public class Test {
    public static void main(String[]args){
<<<<<<< HEAD
        CurrentFacility cf=new House("test", 100);
//        cf=new Fence(cf);
        System.out.println("Hello!");

=======
        Facility cf=new House("test");
        cf=new Awning(cf);
        cf=new Fence(cf);
        cf.getDescription();
>>>>>>> 9321d2157c5bce5239e8db195b09a3dbe0b6da0c
    }
}
