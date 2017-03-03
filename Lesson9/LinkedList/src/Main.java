/**
 * Created by DyXx on 03.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(3));
        System.out.println(list.contains(4));

    }
}
