package src.Item;

/**
 *
 */
public class Awning extends Decorator {
    /**
     *维持一个指向Facility对象的引
     * @param facility
     */
    public Awning(Facility facility) {
        super(facility);

    }

    /**
     * 获取Facility用装饰类装饰后的Facility的描述
     */
    @Override
    public void getDescription() {

        super.getDescription();
        System.out.print(", awning");
    }
}
