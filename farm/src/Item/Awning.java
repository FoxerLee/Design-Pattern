package src.Item;

/**
 * 雨棚类
 * @version 2017/10/26
 * @author bingjieyang
 **/
public class Awning extends Decorator {

    /**
     *
     * @param facility 被装饰者
     */
    public Awning(Facility facility) {
        super(facility);

    }

    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {

        super.getDescription();
        System.out.print(", awning");
    }
}
