package src.Item;


import src.Animal.Dog;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 **/
public class Kennel extends Building {


    public Kennel(String name, int capacity){
        super(name, capacity);
    }
    public Kennel(String name){
        super(name);
    }

    @Override
    public void getDescription(){
        super.getDescription();
        System.out.print(getName()+" is a kennel ");

    }



    public boolean addLodger(Dog dog){
        check(dog);
        return addLodger(dog);
    }

    public boolean removeLodger(Dog dog){
        return removeLodger(dog);
    }
}
