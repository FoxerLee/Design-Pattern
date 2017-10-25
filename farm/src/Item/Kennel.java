package src.Item;


public class Kennel extends Building {
    public Kennel(String name, int capacity) {
        super(name, capacity);
    }

    public Kennel(String name) {
        super(name);
    }

    public void getDescription(){
        super.getDescription();
        System.out.print(getName());
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
