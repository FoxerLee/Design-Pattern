package src.Test;

import src.Animal.Livestock.Sheep;
import src.Item.AnimalProduct.Wool;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Sheep mie = new Sheep();
        int d = 30;
        while (d-- >= 0) {
            Wool p = (Wool) mie.createProduct(d);
            if (p != null) {
                System.out.println(p);
            }
        }
    }

}
