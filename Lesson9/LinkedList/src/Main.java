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
        list.add("hello5");
        list.add("hello6");

        MyLinkedList list2 = new MyLinkedList();
        list2.add("hello1");
        list2.add("hello2");
        list2.add("hello3");
        list2.add("hello4");

//        System.out.println(list.containsAll(list2));
//        System.out.println(list.retainAll(list2));
        System.out.println(list.removeAll(list2));

//        System.out.println(list.removeAll(list2));
//        System.out.println(list.size());
//        System.out.println(list.contains("hello3"));
//
//        System.out.println(list.remove("hello1"));
//        System.out.println(list.size());
//        System.out.println(list.contains("hello2"));
//
//        System.out.println("----");
//
//        MyLinkedList list2 = new MyLinkedList();
//        list2.add("hello5");
//        list2.add("hello6");
//        list2.add("hello7");
//        list.addAll(list2);
//        System.out.println(list.contains("hello5"));
//        System.out.println(list.contains("hello6"));
//        System.out.println(list.contains("hello7"));
//
//        System.out.println(list.size());
//
//        list.clear();
//        System.out.println(list.size());
//        System.out.println(list.contains("two"));


    }
}
