package src.Item.StorageComponent;

import src.Base.Item;
import src.Utility.StorageEntryAddException;

/**
 * Component (Composite Pattern)
 * @author YGH
 * @version 2017-10-29 10:10
 */
public abstract class StorageEntry extends Item{
    /**
     * aGet name of current instance; virtual method.
     * @return name
     */
    public abstract String getName();

    /**
     *
     * @param item
     * Item in storage.
     * @return dummy
     * @throws StorageEntryAddException
     * Should not arrive here.
     */
    public StorageEntry add(Item item) throws StorageEntryAddException {
        throw new StorageEntryAddException();
    }

    /**
     * Print storage structure.
     * @param prefix
     * Parent storage folder.
     */
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getValue() + ")";
    }
}
