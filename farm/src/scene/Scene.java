package src.scene;

import javax.swing.text.html.HTMLDocument;

public class Scene {
    // 利用singleton模式实现，场景在本项目中只有唯一的一个
    private static Scene scene = new Scene();



    private Scene () {

    }
}
