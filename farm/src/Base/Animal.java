package src.Base;

import src.Utility.AnimalBreeding;
import src.Utility.AnimalDiet;


/**
 * Abstraction of animals;
 * @author YGH
 * @version 2017-10-25
 */
public abstract class Animal extends Entity {

    private String description;
    private int age;
    private float marketValue;
    private int health;
    private int breeding;
    private int diet;

    /*
     * Getters & Setters
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public float getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(float marketValue) {
        this.marketValue = marketValue;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBreeding() {
        return breeding;
    }

    /**
     * @param breeding
     * Set by enum AnimalBreeding
     */
    public void setBreeding(int breeding) {
        this.breeding = breeding;
    }

    public int getDiet() {
        return diet;
    }

    /**
     * @param diet
     * Set by enum AnimalDiet
     */
    public void setDiet(int diet) {
        this.diet = diet;
    }

    /**
     * Default constructor
     */
    public Animal() {

    }

    public abstract void eat();

    public abstract void move();

    public abstract void sleep();


    @Override
    public boolean runAction(Action action) {
        return super.runAction(action);
    }
}
