import org.junit.*;
import static org.junit.Assert.*;

public class MyCollectionTest {
    private MyCollection newArrayList;

    @Before
    public void setup() {
        newArrayList = new MyCollection(0);
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
}
