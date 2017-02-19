/**
 * Created by DyXx on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Container container = new Container(5);
        container.addElement(3);
        container.addElementInId(2,4);
        container.print();


        System.out.println();
        System.out.println("I get this "+container.get(2));
        container.contains(3);


        int[]array = {3,4,5};
        container.addAllFromAnotherArray(array);
        container.print();
        System.out.println();

        container.equalsArrays(array);
        container.indexOf(4);
        container.getSize();

        container.clear();
        container.print();
        //////////////////////

        container.addElement(10);
        container.addElement(4);
        container.addElement(6);
        container.addElement(9);
        container.addElement(7);
        container.addElement(5);
        container.addElement(1);
        container.addElement(3);
        container.addElement(8);
        container.addElement(2);
        container.print();
        System.out.println();
        container.quickSort();
        container.print();




        Container container2 = new Container(3);
        container.addElementInId(1,1);
        container.addElementInId(2,2);
        container.addElementInId(3,2);
    }
}
