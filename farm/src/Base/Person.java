package src.Base;

import src.Base.Entity;

/**
 * Created by chenhui on 2017/10/24.
 */

public class Person extends Entity{
    private String ID;
    private int VIT;      //physical power, usually 100;
    private Status status;
    private boolean gender; //0 stands for female, 1 male;

    /**
     *
     */
    enum Status{FREE, BUSY, SICK, DEFAULT};

    protected Person(){};
    protected Person(String ID){
        this.ID = ID;
        this.VIT = 0;
        this.status = Status.DEFAULT;
    }

    public void init(String name, int VIT, boolean gender){
        this.setName(name);
        this.setVIT(VIT);
        this.gender = gender;
        this.status = Status.FREE;
    }

    /**
     * Getter & Setter
     */
    public void setID(String ID){ this.ID = ID; }
    public String getID(){ return ID; }
    public void setVIT(int VIT){ this.VIT = VIT; }
    public int getVIT(){ return VIT; }
    public void setStatus(Status status){ this.status = status; }
    public Status getStatus(){ return status; }

}
