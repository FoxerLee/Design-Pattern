package src.Item;
import src.Base.Person;
import src.Base.Plant;
import src.Base.Entity;

public class House extends Building {

    public String getDescription(){
        return getName();
    }

    public House(String name, int capacity) {
        super(name, capacity);


    }

    public House(String name) {
        super(name);

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
