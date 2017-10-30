package src.Item.Shopping.Stock;

import src.Item.Shopping.Commodity.Piggy;
import src.Item.Shopping.Commodity.RiceSeed;
import src.Item.Shopping.Commodity.WheatSeed;
import src.Item.Shopping.ShoppingList;
import src.Item.Shopping.Stock.Sheep;

/**
 * 此类给出了不同种类的商品的组合：Set1和Set2
 */
public class StocksBuilder {

    public ShoppingList Set1(){
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(new Piggy());
        shoppingList.addItem(new RiceSeed());
        shoppingList.addItem(new Sheep());
        return shoppingList;
    }

    public ShoppingList Set2(){
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addItem(new WheatSeed());
        shoppingList.addItem(new Sheep());
        return shoppingList;
    }
}
