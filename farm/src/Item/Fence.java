package src.Item;

/**
 *
 * @version 2017/10/26
 * @auther bingjieyang
 **/

public class Fence extends Decorator {
    /**
     *被装饰者
     * @param facility
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
