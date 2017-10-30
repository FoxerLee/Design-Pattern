package src.Test;

import src.Item.Shopping.ShoppingList;
import src.Item.Shopping.Stock.StocksBuilder;

/**
 * 建造者模式的测试类
 * 可以创建很多的产品但组成复杂的组合
 * 其中StockBuilder类定义了不同产品的组合方式Set1 和Set2
 */
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
