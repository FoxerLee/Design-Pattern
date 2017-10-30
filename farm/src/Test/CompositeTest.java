package src.Test;

import src.Item.StorageComponent.StorageBox;
import src.Item.StorageComponent.StorageItem;

public class CompositeTest {
    public static void main(String[] args) {
        StorageBox largeBox = new StorageBox("lbox");
        StorageBox mediumBox1 = new StorageBox("mbox_1");
        StorageBox mediumBox2 = new StorageBox("mbox_2");
        StorageBox smallBox = new StorageBox("sbox");
        largeBox.add(mediumBox1);
        largeBox.add(mediumBox2);
        mediumBox1.add(smallBox);
        smallBox.add(new StorageItem("Axe",100));
        largeBox.printList("/");
    }
}
