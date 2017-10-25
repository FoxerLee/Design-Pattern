package src.Item;
<<<<<<< HEAD
import src.Base.Person;
import src.Base.Plant;
import src.Base.Entity;
=======


import src.Base.Person;

>>>>>>> 9321d2157c5bce5239e8db195b09a3dbe0b6da0c

public class House extends Building {



    @Override
    public void getDescription() {
        System.out.print(getName()+" is a house");
    }

<<<<<<< HEAD
    public House(String name, int capacity) {
        super(name, capacity);
=======
    public House(String name) {
        super(name);
>>>>>>> 9321d2157c5bce5239e8db195b09a3dbe0b6da0c
        this.setName(name);
    }

    public boolean addLodger(Person person){
        check(person);
        return addLodger(person);
    }

    public boolean removeLodger(Person person){
        return removeLodger(person);
    }
}
