package src.Item;

public class Awning extends Decorator {


    public Awning(CurrentFacility currentfacility){
        super(currentfacility);
    }



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
    public String getDescription() {
        return getName();
    }
}
