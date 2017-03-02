/**
 * Created by DyXx on 01.03.2017.
 */
public class MyNode {
    private Object object;
    private MyNode next;

    public MyNode(Object object) {
        this.object = object;
        next = null;
    }

    public MyNode(Object object, MyNode next) {
        this.object = object;
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
