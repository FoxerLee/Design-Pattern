package src.Item.StorageComponent;

/**
 * Composite
 * @author YGH
 * @version 2017-10-29 10:10
 */
public class StroageItem extends StorageEntry {
    private String name;
    public StroageItem(String name, int value) {
        this.name = name;
        this.setValue(value);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
