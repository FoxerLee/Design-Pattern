package src.Item.StorageComponent;

/**
 * Leaf (Composite Pattern)
 * @author YGH
 * @version 2017-10-29 10:10
 */
public class StorageItem extends StorageEntry {
    private String name;

    /**
     * Constructor
     * @param name
     * Item name.
     * @param value
     * Item value.
     */
    public StorageItem(String name, int value) {
        this.name = name;
        this.setValue(value);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
