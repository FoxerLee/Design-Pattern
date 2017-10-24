package src.Plant;
import src.Base.*;

public class PlantForSale extends Plant {

    private double price;
    public static int number = 0;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PlantForSale(String name, int exp, LifeStatement lifeStatement){
        super(name, exp, lifeStatement);
    }

    public PlantForSale(String name, int exp, LifeStatement lifeStatement, double price){
        super(name, exp, lifeStatement);
        this.price = price;
    }
}
