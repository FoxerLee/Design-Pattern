package src.Item.Shopping;

public abstract class Stocks implements Commodity {
    @Override
    public OriginPlace getOriginPlace() {
        return new Illinois();
    }

    @Override
    public double weight() {
        return 35.6;
    }

    @Override
    public double price() {
        return 350;
    }
}
