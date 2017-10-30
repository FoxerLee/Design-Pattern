package src.Item.Shopping.Commodity;

import src.Item.Shopping.Commodity.Commodity;
import src.Item.Shopping.Origin.Mexico;
import src.Item.Shopping.Origin.OriginPlace;

/**
 * 此商品是种子
 */
public abstract class Seeds implements Commodity {
    @Override
    public OriginPlace getOriginPlace() {
        return new Mexico();
    }
}
