package src.Item.Shopping;

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
