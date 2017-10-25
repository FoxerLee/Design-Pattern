package src.Base;


public class Plant extends Entity{
    //三个状态：死亡，未成熟和成熟
    private LifeStatement lifeState;

    //成长值：
    private int growthValue;


    public LifeStatement getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeStatement lifeState) {
        this.lifeState = lifeState;
    }

    public Plant(String name, LifeStatement lifeState, int growthValue) {
        super();
        this.growthValue = growthValue;
        setName(name);
        this.lifeState = lifeState;
    }
}
