package src.Item.Shopping;

/**
 * 此商品是动物
 */
public abstract class Stocks implements Commodity {
    @Override
    public OriginPlace getOriginPlace() {
        return new Illinois();
    }
}
