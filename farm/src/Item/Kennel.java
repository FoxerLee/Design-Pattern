package src.Item;


import src.Animal.Dog;

public class Kennel extends Building {


    public Kennel(String name, int capacity){
        super(name, capacity);
    }


    @Override
    public void getDescription(){
        super.getDescription();
        System.out.print(getName());

    }



    public boolean addLodger(Dog dog){
        check(dog);
        return addLodger(dog);
    }

    public boolean removeLodger(Dog dog){
        return removeLodger(dog);
    }
}
