import java.util.Iterator;

/**
 * Created by DyXx on 07.03.2017.
 */
public class MyIterator implements Iterator {

    private MyNode current;

    public MyIterator(MyNode first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Object next() {
        Object toReturn = current.getObject();
        current = current.getNext();
        return toReturn;
    }
}
