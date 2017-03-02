import java.awt.peer.LabelPeer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 1. Реализовать простой контейнер (MyCollection) для всего на базе связного списка
 * Односвязный (next) список:
 * public int size();
 * public boolean isEmpty();
 * public boolean contains(Object o);
 * public boolean add(Object o);
 * public boolean remove(Object o);
 * public boolean addAll(MyCollection c);
 * public void clear();
 * public boolean retainAll(MyCollection c);
 * public boolean removeAll(MyCollection c);
 * public boolean containsAll(MyCollection c);
 * 2. Реализовать интерфейс Iterable для своих реализаций ArrayList и LinkedList
 * 3. Добавить алгоритмы поиска в контейнеры
 */
public class MyLinkedList implements List {
    private MyNode object = null;
    private MyNode first = null;
    private MyNode last = null;
    private int size = 0;

    public MyLinkedList() {
        object = null;
        System.out.println("Empty list created!");;
    }

    public MyLinkedList(MyNode object) {
        first = object = new MyNode(object);
    }



    public MyNode getObject() {return object;}
    public MyNode getFirst(){return first;}
    public void setObject(MyNode object) {
        this.object = object;
    }

    public void setFirst(MyNode first) {
        this.first = first;
    }

    @Override
    public int size() {
        if (!isEmpty()) {
            return this.size;
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object o){
        MyNode element = first;
        while(element!=null){
            if (element.getObject().equals(o)){
                return true;
            }
            element = element.getNext();
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        if (o != null) {
            MyNode node = new MyNode(o);
            if (last == null) {
                this.first = node;
                this.last = node;
                this.size = 1;
            } else {
                last.setNext(node);
                last = node;
                this.size++;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }


    //
//заглушки
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public boolean addAll(int index, Collection c) {
        return false;
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


    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
