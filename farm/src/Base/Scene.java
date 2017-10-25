package src.Base;

import java.util.List;

/*
**Created by Yuan Li
 */
public class Scene {
    // 利用singleton模式实现，场景在本项目中只有唯一的一个
    private static Scene scene = new Scene();
    // 容器
    private List<Object> container;

    private Scene () {
        container = 
    }
    // 获取当前的场景
    public static Scene getScene() {
        return scene;
    }



}
