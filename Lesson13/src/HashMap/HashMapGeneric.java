package HashMap;
import java.util.*;

public class HashMapGeneric<K, V> implements Map<K, V> {
    private final static int DEFAULT_CAPACITY = 16;
    private int size = 0;
    private int capacity;
    private LinkedList<MyEntry<K, V>>[] table;

    public HashMapGeneric() {
        this(DEFAULT_CAPACITY);
    }

    public HashMapGeneric(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];
    }

    private int index(Object key) {
        return Math.abs(key.hashCode() % capacity);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int index = index(key);
        for (MyEntry myEntryList : table[index]){
            MyEntry myEntry = (MyEntry) myEntryList;
            if (myEntry.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = 0; i < capacity;i++){
            if (table[i]!=null){
                if(table[i].get(i).getValue().equals(value)){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int index = index(key);
        if (table[index]==null){
            return null;
        }
        for (MyEntry myEntryList : table[index]){
            MyEntry myEntry = (MyEntry) myEntryList;
            if (myEntry.getKey().equals(key)){
                return (V) myEntry.getValue();
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int index = index(key);
        MyEntry<K, V> newEntry = new MyEntry<>(key, value);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }
        if (!table[index].contains(key)) {
            table[index].add(newEntry);
            size++;
        } else {
            int indexOfEntry = table[index].indexOf(newEntry);
            MyEntry<K,V> oldEntry = table[index].get(indexOfEntry);
            oldEntry.setValue(newEntry.getValue());
            size++;
        }
        return value;
    }

    @Override
    public V remove(Object key) {
        for (int i = 0; i < capacity;i++){
            if (table[i]!=null){
                int indexInBucket = 0;
                    while(indexInBucket<table[i].size()){
                        if(table[i].get(indexInBucket).getKey().equals(key)){
                            table[i].get(indexInBucket).setValue(null);
                            size--;
                            return null;
                        }
                        indexInBucket++;
                    }
            }
        }
        return null;
    }
//    @Override
//    public V remove(Object key) {
//        Entry<K,V> result = null;
//        K castedKey = (K)key;
//        int bucketIndex = index(key);
//        Entry<K,V> checkedEntry = new MyEntry<>(castedKey, null);
//        int index = table[bucketIndex].indexOf(checkedEntry);
//        if (index>-1){
//            result = table[bucketIndex].remove(index);
//            if (result!=null){
//                size--;
//            }
//        }
//        return null;
//    }


    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for(Map.Entry<? extends K, ? extends V> myEntry : m.entrySet()){
            this.put(myEntry.getKey(),myEntry.getValue());
        }
    }

    @Override
    public void clear() {
        size = 0;
        for (int i = 0;i < table.length;i++){
            table[i] = null;
        }
    }

    @Override
    public Set<K> keySet() {
        Set<K> set = new HashSet<>();
        for (int i=0; i<capacity; i++){
            if (table[i]!=null) {
                for (Entry<K, V> entry : table[i]) {
                    set.add(entry.getKey());
                }
            }
        }
        return set;
    }

    @Override
    public Collection<V> values() {
        Collection<V> vCollection = new LinkedList<>();
        for (int i=0; i<capacity; i++){
            if (table[i]!=null) {
                for (Entry<K, V> entry : table[i]) {
                    vCollection.add(entry.getValue());
                }
            }
        }
        return vCollection;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        for (int i=0; i<capacity; i++){
            if (table[i]!=null) {
                set.addAll(table[i]);
            }
        }
        return set;
    }
}
