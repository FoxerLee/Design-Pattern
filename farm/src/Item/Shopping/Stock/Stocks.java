package src.Item.Shopping.Stock;

import src.Item.Shopping.Commodity.Commodity;
import src.Item.Shopping.Origin.Illinois;
import src.Item.Shopping.Origin.OriginPlace;

/**
 * 此商品是动物
 */
public abstract class Stocks implements Commodity {
    @Override
    public OriginPlace getOriginPlace() {
        return new Illinois();
    }
}
