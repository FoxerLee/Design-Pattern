package src.Item.Shopping;

/**
 * 此商品是种子
 */
public abstract class Seeds implements Commodity {
    @Override
    public OriginPlace getOriginPlace() {
        return new Mexico();
    }
}
