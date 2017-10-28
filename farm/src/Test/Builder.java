package src.Test;

import src.Item.Shopping.ShoppingList;
import src.Item.Shopping.StocksBuilder;

public class Builder {
    public static void main(String[] args){
        StocksBuilder builder = new StocksBuilder();
        ShoppingList list1 = builder.Set1();
        ShoppingList list2 = builder.Set2();

        System.out.println("Let's show the list 1:");
        list1.ShowItems();
        System.out.println("And the total price is " + list1.getTotalCost());
    }
}
