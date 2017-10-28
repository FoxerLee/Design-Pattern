package src.Item.Shopping;

public class Sheep extends Stocks {
    @Override
    public String name() {
        return "Sheep, \'mie~\'";
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
