import java.util.Iterator;

/**
 * Created by DyXx on 06.03.2017.
 * implements Iterable
 * public Iterator iterator() {
 * return null;
 * }
 */
public class MyLinkedListIterable implements Iterable{
    private MyNode first = null;
    private MyNode lastAdded = null;
    private int size = 0;

    public MyNode getFirst() {
        return first;
    }

    public MyNode getLastAdded() {
        return lastAdded;
    }

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
            first = lastAdded = new MyNode(o);
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
            }
            previous = currentObject;
            currentObject = currentObject.getNext();
        }
        return false;
    }


    public boolean addAll(MyLinkedListIterable c) {
        if (c != null) {
            this.lastAdded.setNext(c.getFirst());
            lastAdded = c.getFirst();
            this.size += c.size();
            return true;
        }
        return false;
    }

    public void clear() {
        this.first = null;
        this.lastAdded = null;
        this.size = 0;
    }


    public boolean containsAll(MyLinkedListIterable c) {
        if (this.equals(c)) {
            return true;
        }
        MyNode tempNode = c.first;
        while (tempNode != null) {
            if (!this.contains(tempNode.getObject())) {
                return false;
            }
            tempNode = tempNode.getNext();
        }
        return true;
    }

    public boolean retainAll(MyLinkedListIterable c) {
        MyNode  tempNode = this.first;
        while (tempNode != null) {
            if (!c.contains(tempNode.getObject())) {
                this.remove(tempNode.getObject());
            }
            tempNode = tempNode.getNext();
        }
        return c.containsAll(this);
    }

    public boolean removeAll(MyLinkedListIterable c) {

        MyNode  tempNode = this.first;
        while (tempNode != null) {
            if (c.contains(tempNode.getObject())) {
                this.remove(tempNode);
            }
            tempNode = tempNode.getNext();
        }
        return !c.containsAll(this);
    }


    @Override
    public Iterator iterator() {
        return new MyIterator(first);
    }
}

