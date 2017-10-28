package src.Item;

import src.Base.Item;

/**
 * 装饰类
 * @version 2017/10/26
 * @author bingjieyang
 *
 *
 */
public class Decorator extends Item implements Facility {

    /**
     *
     * @param facility facility为Facility的指针，用于装饰者模式中指向被装饰的类
     */
    public Decorator(Facility facility) {

        this.facility = facility;
    }


    /**
     * 获取被装饰者用装饰类装饰后的被装饰者的描述
     */
    @Override
    public void getDescription() {
        facility.getDescription();

    }

    /**
     *
     * facility为Facility的指针，用于装饰者模式中指向被装饰的类
     */
    private Facility facility;

}
