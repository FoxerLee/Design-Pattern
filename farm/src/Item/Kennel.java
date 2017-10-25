package src.Item;


public class Kennel extends Building {
<<<<<<< HEAD
    public Kennel(String name, int capacity){
        super(name, capacity);
    }

    public String getDescription(){
        return getName();
=======
    public Kennel(String name, int capacity) {
        super(name, capacity);
    }

    public Kennel(String name) {
        super(name);
    }

    public void getDescription(){
        super.getDescription();
        System.out.print(getName());
>>>>>>> 9321d2157c5bce5239e8db195b09a3dbe0b6da0c
    }



//    public boolean addLodger(Dog dog){
//        check(dog);
//        return addLodger(dog);
//    }
//
//    public boolean removeLodger(Dog dog){
//        return removeLodger(dog);
//    }
}
