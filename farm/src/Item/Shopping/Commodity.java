package src.Item.Shopping;

import src.Base.Entity;

/**
 * 商品接口
 */
public interface Commodity {
    /**
     * 返回商品名称
     * @return
     */
    public String name();

    /**
     * 返回商品价格
     * @return
     */
    public double price();

    /**
     * 返回商品重量
     * @return
     */
    public double weight();

    /**
     * 返回商品的发源地
     * @return
     */
    public OriginPlace getOriginPlace();
}
