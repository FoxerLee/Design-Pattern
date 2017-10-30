package src.Base;
import java.util.*;

// 瀹炵幇璁捐妯″紡 -- 杩唬鍣ㄦā寮�
interface Iterator {
    // 鑾峰彇涓嬩竴涓暟鎹�
    public Object next();
    // 鍒ゆ柇鏄惁鏈変笅涓�涓暟鎹�
    public boolean hasNext();

}

public class ConcreteIterator<T> implements Iterator {
    private List<T> list;
    private int cursor = 0;

    public ConcreteIterator() {
        this.list = new ArrayList<T>();
    }
    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (this.list.size() == cursor)
            return false;
        else
            return true;
    }

    public T next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor);
            ++cursor;
        }
        return obj;
    }

}
