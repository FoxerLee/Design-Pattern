package src.Person;

import src.Base.Entity;

/**
 * Basic Person class
 * @author chenhui
 *
 */

public class Person extends Entity{
    private String ID;
    private int VIT;      //physical power, usually 100;
    private PersonState state;
    private boolean gender; //0 stands for female, 1 male;

    /**
     *
     *
     */
    protected Person(){};
    protected Person(String ID){
        this.ID = ID;
        this.VIT = 0;
    }

    public void init(String name, int VIT, boolean gender){
        this.setName(name);
        this.setVIT(VIT);
        this.gender = gender;
        this.state = new FreeState(this);
    }


    /**
     * Getter & Setter
     */
    public void setID(String ID){ this.ID = ID; }
    public String getID(){ return ID; }
    public void setVIT(int VIT){ this.VIT = VIT; }
    public int getVIT(){ return VIT; }
    public void setState(PersonState state){
        this.state = state;
    }

    public void work(){
        this.state.work();
    }

    public void sleep(){
        this.state.sleep();
    }

    public void stop(){
        this.state.stop();
    }
}
