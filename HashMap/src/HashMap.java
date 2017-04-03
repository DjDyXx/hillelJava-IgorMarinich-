import java.util.*;


public class HashMap {
    private static final int CAPASITY = 16;
    private LinkedList[] table = new LinkedList[CAPASITY];
    private int size = 0;


    public void put(Object key, Object value) {
        int hashIndex = Math.abs(key.hashCode() % CAPASITY);
        Entry entry = new Entry(key, value);
        LinkedList linkedList = table[hashIndex];
        if (linkedList == null) {
            linkedList = new LinkedList();
        }
        if (!linkedList.contains(entry)) {
            linkedList.add(entry);
            size++;
        } else {
            int i = linkedList.indexOf(entry);
            Entry newEntry = (Entry) linkedList.get(i);
            newEntry.setValue(entry.getValue());
            size++;
        }

        table[hashIndex] = linkedList;
    }

    public Object get(Object key) {
        int hashIndex = Math.abs(key.hashCode() % CAPASITY);
        LinkedList linkedList = table[hashIndex];
        if (linkedList == null) {
            return null;
        }
        for (Object entryList : linkedList) {
            Entry entry = (Entry) entryList;
            if (entry.getKey().equals(key)) {
                return (entry.getValue());
            }
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
