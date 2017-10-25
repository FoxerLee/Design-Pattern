package src.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
// 实现设计模式 -- 迭代器模式
interface Iterator {
    // 获取下一个数据
    public Object next();
    // 判断是否有下一个数据
    public boolean hasNext();

    public Object first();
}

class ConcreteIterator implements Iterator {
    private Aggregate list;
    private int cursor = 0;

    public ConcreteIterator() {
        this.list = new Aggregate();
    }
    public ConcreteIterator(Aggregate list) { this.list = list; }

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

    public Object first() {
        return this.list.get(0);
    }

}

public class Aggregate {
    private Object[] elements;
    private int size;

    // 默认构造函数
    public Aggregate() {
        // 默认10个
        this.size = 10;
        this.elements = new Object[size];
    }
    // 构造函数
    public Aggregate(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("IllegalArgument:"+size);
        }
        else {
            this.size = size;
            this.elements = new Object[this.size];
        }
    }
    // 添加到最后
    public void addLast(Object obj) {
        checkCapacity(size+1);
        elements[size++] = obj;
    }
    // 添加到指定的索引处
    public void add(int index, Object obj) {
        RangeCheck(index);
        checkCapacity(size+1);
        System.arraycopy(elements, index, elements, index+1, size-index);
        elements[index] = obj;
        size++;
    }

    public Object get(int index) {
        RangeCheck(index);
        return elements[index];
    }

    public void set(int index, Object obj) {
        RangeCheck(index);
        elements[index] = obj;
    }

    public void remove(int index) {
        RangeCheck(index);

        int move = size - index - 1;
        if (move > 0) {
            System.arraycopy(elements, index+1, elements, index, move);
        }
        elements[--size] = null;
    }

    public int size() {
        return this.size;
    }

    public int length() {
        return this.elements.length;
    }

    public ConcreteIterator newIterator() {
        return new ConcreteIterator(this);
    }

    private void checkCapacity(int needSize) {
        if (needSize > elements.length) {
            Object oldElements[] = this.elements;
            // 扩容的空间
            int newSize = this.size*2+1;
            elements = new Object[newSize];
            elements = Arrays.copyOf(oldElements, newSize);
        }
    }

    private void RangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("IllegalArgument"+index);
        }
    }


}
