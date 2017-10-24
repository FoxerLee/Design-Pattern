package src;
import java.util.*;

// 实现设计模式 -- 迭代器模式
interface Iterator {
    // 获取下一个数据
    public Object next();
    // 判断是否有下一个数据
    public boolean hasNext();

}

public class ConcreteIterator implements Iterator {
    private List list;
    private int cursor = 0;

    public ConcreteIterator() {
        this.list = new ArrayList();
    }
    public ConcreteIterator(List list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (this.list.size() == cursor)
            return false;
        else
            return true;
    }

    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }

}
