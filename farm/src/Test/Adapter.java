package src.Test;

import src.Item.Desklamp;
import src.Item.Farmland;

/**
 * 适配器模式测试类
 * 当没有路灯类Lamppost但有台灯类Desklamp时
 * 可以通过Item.Adapter类来实现一个Lamppost的接口
 * @author bingjieyang
 * @version 2017/10/30
 **/
public class Adapter {
    public static void main(String[] args) {
        // 测试适配器模式
        Desklamp desklamp=new Desklamp();
        Farmland f4=new Farmland("test4");
        f4.turnOn(f4);
        f4.turnOff(f4);

    }
}
