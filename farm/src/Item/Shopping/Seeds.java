package src.Item.Shopping;

public abstract class Seeds implements Commodity {
    @Override
    public OriginPlace getOriginPlace() {
        return new Mexico();
    }
}
