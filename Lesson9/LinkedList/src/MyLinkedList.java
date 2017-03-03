import java.awt.peer.LabelPeer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * public boolean addAll(MyCollection c);
 * public void clear();
 * public boolean retainAll(MyCollection c);
 * public boolean removeAll(MyCollection c);
 * public boolean containsAll(MyCollection c);
 * 2. Реализовать интерфейс Iterable для своих реализаций ArrayList и LinkedList
 * 3. Добавить алгоритмы поиска в контейнеры
 */
public class MyLinkedList implements Iterable {
    private MyNode first = null;
    private MyNode lastAdded = null;
    private MyNode object;
    private MyNode tempObject = object;
    private int size = 0;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        MyNode tempFirst = first;
        while (tempFirst != null) {
            if (tempFirst.getObject().equals(o)) {
                return true;
            }
            tempFirst = tempFirst.getNext();
        }
        return false;
    }

    public boolean add(Object o) {
        if (first == null) {
            object = first = lastAdded = new MyNode(o);
            this.size = 1;
            return true;
        }
        if (size >= 1) {
            MyNode newNode = new MyNode(o);
            lastAdded.setNext(newNode);
            lastAdded = newNode;
            this.size++;
            return true;
        }

        return false;
    }

    public boolean remove(Object o) {
        MyNode currentObject = first;
        MyNode previous = null;
        while (currentObject != null) {
            if (currentObject.getObject().equals(o)) {
                if (currentObject == first) {
                    first = currentObject.getNext();
                    size--;
                    return true;
                } else if (currentObject == lastAdded) {
                    lastAdded = previous;
                    lastAdded.setNext(null);
                    size--;
                    return true;
                } else {
                    previous.setNext(currentObject.getNext());
                    size--;
                    return true;
                }
            }previous = currentObject;
            currentObject = currentObject.getNext();
        }
        return false;
    }


    //    @Override
//    public boolean remove(Object o) {
//        int tempSize = this.size;
//        if (!isEmpty()) {
//            while (tempSize != 0) {
//                MyNode tempNextObject = object.getNext();
//                if (tempNextObject==(null)) {
//                    last = object;
//                    size--;
//                    return true;
//                } else {
//                    if (tempNextObject.getObject().equals(o)) {
//                        object.setNext(tempNextObject.getNext());
//                        object.setNext(object.getNext());
//                        size--;
//                        return true;
//                    }else{
//                        object = object.getNext();
//                        tempSize--;
//                    }
//                }
//            }
//        }return false;
//    }
//
//    public boolean addAll(Collection c) {
//        return false;
//    }
//
//    public void clear() {
//    }
//
//    public boolean retainAll(Collection c) {
//        return false;
//    }
//
//    public boolean removeAll(Collection c) {
//        return false;
//    }
//
//    public boolean containsAll(Collection c) {
//        return false;
//    }
//
    public Iterator iterator() {
        return null;
    }
}
