package src.Item.Shopping;

public class Sheep extends Stocks {
    /**
     * 名字是羊
     * @return
     */
    @Override
    public String name() {
        return "Sheep, \'mie~\'";
    }

    /**
     * 重量是35.6
     * @return
     */
    @Override
    public double weight() {
        return 35.6;
    }

    /**
     * 价格是350
     * @return
     */
    @Override
    public double price() {
        return 350;
    }
}
