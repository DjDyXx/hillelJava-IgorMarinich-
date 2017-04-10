import org.junit.Assert;
import org.junit.Test;
public class MyCollection {

    @Test
    public void testAdd(){
        MyCollection newArrayList = new MyCollection();
        newArrayList.add(2);
        Assert.assertTrue("hey no",newArrayList.size()==1);
    }
}
