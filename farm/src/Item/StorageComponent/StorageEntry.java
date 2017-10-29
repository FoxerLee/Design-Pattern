package src.Item.StorageComponent;

import src.Base.Item;
import src.Utility.StorageEntryAddException;

/**
 * Composite
 * @author YGH
 * @version 2017-10-29 10:10
 */
public abstract class StorageEntry extends Item{
    public abstract String getName();
    public StorageEntry add(Item item) throws StorageEntryAddException {
        throw new StorageEntryAddException();
    }
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getValue() + ")";
    }
}
