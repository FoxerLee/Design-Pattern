package src.Item.Shopping;

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
