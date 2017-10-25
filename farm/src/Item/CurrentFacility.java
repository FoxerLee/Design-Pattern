package src.Item;
import src.Base.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CurrentFacility extends Item implements Facility {

    private int capacity;
    private int usedCapacity;
    private List lodgerList;

    public CurrentFacility(String name,int capacity) {
        this.capacity = capacity;
        this.usedCapacity = 0;
        initList();
        this.setName(name);
    }

    public CurrentFacility(String name) {
        this.capacity = 2;
        this.usedCapacity = 0;
        initList();
    }


    private boolean initList(){
        lodgerList=new List() {
            @Override
            public int size() {
                return capacity;
            }

            @Override
            public boolean isEmpty() {
                return true;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public Object set(int index, Object element) {
                return null;
            }

            @Override
            public void add(int index, Object element) {

            }

            @Override
            public Object remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int index) {
                return null;
            }

            @Override
            public List subList(int fromIndex, int toIndex) {
                return null;
            }
        };

        return true;
    }

    public boolean check(Entity e){
        if (e!=null)
            return true;
        else
            return false;
    }

    protected boolean addLodger(Entity e){
        check(e);
        return lodgerList.add(e);
    }


    public boolean removeLodger(Entity e){
        return  lodgerList.remove(e);
    }



    @Override
    public String getDescription() {
        return getName();
    }

    public boolean isFull(){
        return lodgerList.size()>=capacity;
    }

    public boolean isEmpty(){
        return lodgerList.isEmpty();
    }

    public boolean upgrade(){
        if (capacity*2>Integer.MAX_VALUE){
            return false;
        }
        else {
            capacity=capacity*2;
            return true;
        }
    }

    public boolean degrade(){
        if (capacity/2<0||capacity/2<usedCapacity){
            return false;
        }
        else {
            capacity=capacity/2;
            return true;
        }

    }
}
