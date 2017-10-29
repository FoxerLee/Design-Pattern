package src.Item.StorageComponent;

import src.Base.Item;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Composite (Composite Pattern)
 * @author YGH
 * @version 2017-10-29 10:10
 */
public class StorageBox extends StorageEntry {
    private String name;
    private ArrayList<Item> storageBox = new ArrayList();

    /**
     * Add an item to storage box and set its value to total value.
     * @param item
     * Item in storage.
     * @return dummy
     */
    @Override
    public StorageEntry add(Item item) {
        storageBox.add(item);
        int newValue = this.getValue() + item.getValue();
        this.setValue(newValue);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator iter = storageBox.iterator();
        while (iter.hasNext()) {
            StorageEntry e = (StorageEntry)iter.next();
            e.printList(prefix + "/" + name);
        }
    }
}
