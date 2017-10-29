package src.Item.Shopping;

/**
 * 动物商品的接口实现
 */
public class Piggy extends Stocks {
    /**
     * 价格367
     * @return
     */
    @Override
    public double price() {
        return 367;
    }

    /**
     * 重量为65
     * @return
     */
    @Override
    public double weight() {
        return 65;
    }

    /**
     * 名字是小猪
     * @return
     */
    @Override
    public String name() {
        return "Piggy!";
    }
}