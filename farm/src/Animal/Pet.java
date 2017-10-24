package src.Animal;

import src.Base.Animal;

/**
 * @author YGH
 * @version 2017-10-25
 */
public class Pet extends Animal {

    private int intimacy;

    /*
     * Getters and Setters
     */
    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    /**
     * Pets can please farmers
     */
    public void entertain() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }
}
