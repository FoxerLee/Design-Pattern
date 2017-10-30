package src.Base;
import java.util.*;


interface Iterator {

    public Object next();

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
