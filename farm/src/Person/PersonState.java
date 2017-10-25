package src.Person;

/**
 * Using State Pattern
 *
 * @author chenhui
 * @time 2017/10/25.
 */


abstract public class PersonState {
    protected Person person;
    public abstract void work();
    public abstract void sleep();
    public abstract void stop();
}


class FreeState extends PersonState{
    public FreeState(Person person){
        this.person = person;
    }

    public FreeState(PersonState state){
        this.person = state.person;
    }

    public void work(){
        System.out.println(person.getName() + " is working now.");
        person.setState(new BusyState(this));
    }

    public void sleep(){
        System.out.println(person.getName() + "is sleeping now.");
        person.setState(new SleepState(this));
    }

    public void stop(){
        System.out.println("ERROR!");
        System.out.println(person.getName() + " is doing nothing");
    }
}

class BusyState extends PersonState{
    public BusyState(Person person){
        this.person = person;
    }

    public BusyState(PersonState state){
        this.person = state.person;
    }

    public void work(){
        System.out.println("ERROR!");
        System.out.println(person.getName() + " is doing another thing already.");
    }

    public void sleep(){
        System.out.println(person.getName() + "is sleeping now.");
        person.setState(new SleepState(this));
    }

    public void stop(){
        System.out.println(person.getName() + " is free now");
        person.setState(new FreeState(this));
    }
}

class SleepState extends PersonState{
    public SleepState(Person person){
        this.person = person;
    }

    public SleepState(PersonState state){
        this.person = state.person;
    }

    public void work(){
        System.out.println(person.getName() + " is working now.");
        person.setState(new BusyState(this));
    }

    public void sleep(){
        System.out.println("ERROR!");
        System.out.println(person.getName() + "is sleeping already.");
    }

    public void stop(){
        System.out.println(person.getName() + " is free now");
        person.setState(new FreeState(this));
    }
}



