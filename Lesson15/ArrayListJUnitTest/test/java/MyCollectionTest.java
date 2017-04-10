import org.junit.*;

import static org.junit.Assert.*;

public class MyCollectionTest {
    private MyCollection newArrayList;

    @Before
    public void setup() {
        newArrayList = new MyCollection(0);
    }

    @Test
    public void size(){
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        newArrayList.add(4);
        assertEquals(true,newArrayList.size()==4);
    }

    @Test
    public void isEmpty(){
        assertEquals(true,newArrayList.size()==0);
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.remove(1);
        newArrayList.remove(2);
        assertEquals(false,newArrayList.contains(1));
        assertEquals(false,newArrayList.contains(2));
        assertEquals(true,newArrayList.size()==0);
    }

    @Test
    public void contains(){
        newArrayList.add(1);
        assertEquals(true,newArrayList.size()==1);
        assertEquals(true,newArrayList.contains(1));
        newArrayList.remove(1);
        assertEquals(true,newArrayList.size()==0);
        assertEquals(false,newArrayList.contains(1));

    }

    @Test
    public void testAdd() {
       newArrayList.add(2);
        assertTrue("hey no", newArrayList.size() == 1);
    }

    @Test
    public void testAdd2() {
        newArrayList.add(2);
        assertEquals(true,newArrayList.contains(2));
    }

    @Test
    public void remove(){
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        assertEquals(true,newArrayList.size()==3);
        newArrayList.remove(1);
        newArrayList.remove(2);
        newArrayList.remove(3);
        assertEquals(true,newArrayList.size()==0);
    }

    @Test
    public void addAll(){
        MyCollection testCollection = new MyCollection(0);
        testCollection.add(5);
        testCollection.add(10);
        testCollection.add(51);
        newArrayList.addAll(testCollection);
        assertEquals(true,newArrayList.size()==testCollection.size());
        assertEquals(true,newArrayList.contains(5));
        assertEquals(true,newArrayList.contains(10));
        assertEquals(true,newArrayList.contains(51));


    }

    @Test
    public void clear(){
        newArrayList.add(1);
        newArrayList.add(4);
        assertEquals(false,newArrayList.size()==0);
        assertEquals(true,newArrayList.contains(1));
        assertEquals(true,newArrayList.contains(4));
        assertEquals(false,newArrayList.isEmpty());
        newArrayList.remove(1);
        newArrayList.remove(4);
        assertEquals(true,newArrayList.isEmpty());
        assertEquals(true,newArrayList.size()==0);
    }

    @Test
    public void retainAll(){
        MyCollection testCollection = new MyCollection(0);
        testCollection.add(5);
        testCollection.add(10);
        testCollection.add(51);
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        newArrayList.addAll(testCollection);
        assertEquals(true,newArrayList.size()==6);
        newArrayList.retainAll(testCollection);
        assertEquals(false,newArrayList.contains(1));
        assertEquals(false,newArrayList.contains(2));
        assertEquals(false,newArrayList.contains(3));
        assertEquals(true,newArrayList.size()==3);
    }

    @Test
    public void removeAll(){
        MyCollection testCollection = new MyCollection(0);
        testCollection.add(5);
        testCollection.add(10);
        newArrayList.add(5);
        newArrayList.add(10);
        newArrayList.add(103);
        assertEquals(true,newArrayList.contains(5));
        assertEquals(true,newArrayList.contains(10));
        assertEquals(true,newArrayList.contains(103));
        newArrayList.removeAll(testCollection);
        assertEquals(true,newArrayList.contains(103));
        assertEquals(false,newArrayList.contains(5));
        assertEquals(false,newArrayList.contains(10));
    }

    @Test
    public void containsAll(){
        MyCollection testCollection = new MyCollection(0);
        testCollection.add(5);
        testCollection.add(10);
        newArrayList.add(5);
        newArrayList.add(10);
        newArrayList.add(103);
        assertEquals(true,newArrayList.containsAll(testCollection));

    }
}
