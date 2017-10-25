package src.Item;

<<<<<<< HEAD

import src.Base.Person;
import src.Base.Plant;
=======
import src.Base.Entity;
>>>>>>> 5e4d1d5c0b55f95171a5f196bf4827dafb880ead

public class House extends Building {

    public String getDescription(){
        return getName();
    }

    public House(String name) {
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
