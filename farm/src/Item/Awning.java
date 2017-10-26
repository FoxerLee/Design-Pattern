package src.Item;

/**
 * 遮阳篷类
 */
public class Awning extends Decorator {

    /**
     *被装饰者
     * @param facility
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
