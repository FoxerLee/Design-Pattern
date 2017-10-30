package src.Animal.Livestock;

import src.Base.Animal;

/**
 * @author YGH
 * @version 2017-10-25
 */
public class WildAnimal extends Animal {

    private int wildness;

    /*
     * Getters & Setters
     */
    public int getWildness() {
        return wildness;
    }

    public void setWildness(int wildness) {
        this.wildness = wildness;
    }

    /**
     * Wild animals would be tamed if its wildness become zero;
     * @return isTamed
     * Return the result of taming.
     */
    public boolean tamed(int delta) {
        wildness -= delta;
        if (wildness < 0) {
            /*
            To do: Change Wild animal into livestock.
             */
            return true;
        } else {
            return false;
        }
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
