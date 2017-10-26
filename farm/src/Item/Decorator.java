package src.Item;

import src.Base.Item;

/**
 * @version 2017/10/26
 * @auther bingjieyang
 *
 * 装饰类
 * facility为Facility的指针，用于装饰者模式中指向被装饰的类
 */
public class Decorator extends Item implements Facility {

    /**
     * facility为Facility的指针，用于装饰者模式中指向被装饰的类
     * @param facility
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

    private Facility facility;

}
