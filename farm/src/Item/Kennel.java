package src.Item;


public class Kennel extends Building {
    public Kennel(String name, int capacity){
        super(name, capacity);
    }

    public String getDescription(){
        return getName();
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
