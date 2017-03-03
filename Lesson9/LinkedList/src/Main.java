/**
 * Created by DyXx on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("hello1");
        list.add("hello2");
        list.add("hello3");
        list.add("hello4");
        System.out.println(list.size());
        System.out.println(list.contains("hello3"));

        System.out.println(list.remove("hello1"));
        System.out.println(list.size());
        System.out.println(list.contains("hello2"));

    }
}
