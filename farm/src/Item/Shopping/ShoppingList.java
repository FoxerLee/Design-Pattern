package src.Item.Shopping;

import java.util.ArrayList;

public class ShoppingList {
    public ArrayList<Commodity> commodities = new ArrayList<>();

    public void addItem(Commodity commodity){
        commodities.add(commodity);
    }

    public double getTotalCost(){
        double price = 0.0;
        for(Commodity c : commodities){
            price+= c.price();
        }
        return price;
    }

    public void ShowItems(){
        for(Commodity c : commodities){
            System.out.println("Name: " + c.name());
            System.out.println("Where you buy it? : " + c.getOriginPlace().getName());
            System.out.println("Price: " + c.price());
            System.out.println("Weight : " + c.weight() + "\n");
        }
    }
}
