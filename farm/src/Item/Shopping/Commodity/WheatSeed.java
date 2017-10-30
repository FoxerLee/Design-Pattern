package src.Item.Shopping.Commodity;

import src.Item.Shopping.Commodity.Seeds;

public class WheatSeed extends Seeds {
    /**
     * 获得小麦种子名称
     * @return
     */
    @Override
    public String name() {
        return "Wheat Seed";
    }

    /**
     * 价格30
     * @return
     */
    @Override
    public double price() {
        return 30;
    }

    /**
     * 重量1.5
     * @return
     */
    @Override
    public double weight() {
        return 1.5;
    }
}
