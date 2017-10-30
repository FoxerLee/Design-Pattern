package src.Item.Shopping.Commodity;

public class RiceSeed extends Seeds {
    /**
     * 定义种子名称：水稻种子
     * @return
     */
    @Override
    public String name() {
        return "Rice Seed";
    }

    /**
     * 定义水稻种子价格：50.0
     * @return
     */
    @Override
    public double price() {
        return 50.0;
    }

    /**
     * 定义种子总重量
     * 2.5千克
     * @return
     */
    @Override
    public double weight() {
        return 2.5;
    }
}
