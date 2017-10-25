package src.Item;


import src.Base.Person;


public class House extends Building {



    @Override
    public void getDescription() {
        System.out.print(getName()+" is a house");
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
