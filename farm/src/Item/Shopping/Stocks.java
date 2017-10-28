package src.Item.Shopping;

public abstract class Stocks implements Commodity {
    @Override
    public OriginPlace getOriginPlace() {
        return new Illinois();
    }
}
