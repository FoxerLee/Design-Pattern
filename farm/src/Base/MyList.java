package src.Base;

import java.util.ArrayList;
import java.util.List;
/**
 * 数组实现
 * @version 2017/10/29
 * @author LiMianHong
 */
public class MyList<T> {
	//保存元素的容器
	private List<T> container;
	//目前数组的大小
	private int size;
	
	/**
     * 构造函数
     *
     */
	public MyList() {
		container = new ArrayList<T>();
		size = 0;
	}
	
	/**
     * 给数组中添加一个元素
     * 
     * @param ele 所添加的元素
     *
     */
	public void add(T ele) {
		container.add(ele);
		++size;
	}
	
	/**
     * 从数组中获取一个元素
     * 
     * @param i 元素对应的索引
     *
     */
	public T getValue(int i) {
		if(size <= i) {
			System.out.println("index out of range");
			return null;
		}
		return container.get(i);
	}
	
	/**
     * 从数组中移除一个元素
     * 
     * @param i 元素对应的索引
     *
     */
	public void remove(int i) {
		container.remove(i);
	}
	
	/**
     * 获取数组对应的迭代器
     *
     * @return  数组对应的迭代器
     */
	public ConcreteIterator<T> getIterator() {
		return new ConcreteIterator<T>(container);
	}
}
