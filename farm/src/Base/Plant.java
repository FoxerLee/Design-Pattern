package src.Base;

import src.Base.Entity;

public class Plant extends Entity{

    private int exp;
    private LifeStatement lifeState;

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public LifeStatement getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeStatement lifeState) {
        this.lifeState = lifeState;
    }

    public Plant(String name, int exp, LifeStatement lifeState) {
        super();
        setName(name);
        this.exp = exp;
        this.lifeState = lifeState;
    }
}
