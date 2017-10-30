package src.Item.Shopping;

import src.Item.Shopping.Commodity.Commodity;

import java.util.ArrayList;

/**
 * 此类是各样商品的整合
 */
public class ShoppingList {
    /**
     * 商品列表
     */
    public ArrayList<Commodity> commodities = new ArrayList<>();

    /**
     * 添加商品
     * @param commodity
     */
    public void addItem(Commodity commodity){
        commodities.add(commodity);
    }

    /**
     * 获取商品总价格
     * @return
     */
    public double getTotalCost(){
        double price = 0.0;
        for(Commodity c : commodities){
            price+= c.price();
        }
        return price;
    }

    /**
     * 显示商品列表的名字
     */
    public void ShowItems(){
        for(Commodity c : commodities){
            System.out.println("Name: " + c.name());
            System.out.println("Where you buy it? : " + c.getOriginPlace().getName());
            System.out.println("Price: " + c.price());
            System.out.println("Weight : " + c.weight() + "\n");
        }
    }
}
