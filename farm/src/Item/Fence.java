package src.Item;

/**
 *篱笆类
 * @version 2017/10/26
 * @author bingjieyang
 **/

public class Fence extends Decorator {
    /**
     *
     * @param facility 被装饰者
     */
    public Fence(Facility facility) {
        super(facility);
    }

    @Override
    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    public void getDescription() {

        super.getDescription();
        System.out.print(", fence");
    }

}
