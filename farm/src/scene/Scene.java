<<<<<<< HEAD
package src.Scene;

import javax.swing.text.html.HTMLDocument;
=======
/*
**Created by Yuan Li
 */
package src.scene;
import src.ConcreteIterator;
import src.Item.ImmovableProperty;
>>>>>>> liyuan

public class Scene {
    // 利用singleton模式实现，场景在本项目中只有唯一的一个
    private static Scene scene = new Scene();
    // 容器
    private ConcreteIterator container;

    private Scene () {
        container = new ConcreteIterator();
    }
    // 获取当前的场景
    public static Scene getScene() {
        return scene;
    }

    public boolean add (ImmovableProperty pro) {
        container
    }

}
