package src.Item;

/**
 * 遮阳篷类
 */
public class Awning extends Decorator {
<<<<<<< HEAD

    public Awning(CurrentFacility currentfacility){
        super(currentfacility);
    }

=======
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
>>>>>>> 9321d2157c5bce5239e8db195b09a3dbe0b6da0c
    @Override
    public void getDescription() {

        super.getDescription();
        System.out.print(", awning");
    }
}
