/**
 * Created by DyXx on 06.03.2017.
 */
public class MyNode {
    private Object object;
    private MyNode next;
    private MyNode previous;

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

