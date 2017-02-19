import java.util.Random;

/**
 * Created by DyXx on 17.02.2017.
 */
public class Container {
    private int[] array;

    public Container(int size) {
        array = new int[size];
    }


    public void addElement(int number) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = number;
        this.array = newArray;
    }

    public void addElementInId(int id, int number) {
        for (int i = 0; i < array.length; i++) {
            if (i == id - 1) {
                array[i] = number;
            }
        }
    }

    public int get(int id) {
        return array[id - 1];
    }

    public void contains(int element) {
        if (isTrueElement(element)) {
            System.out.println("Yes ,this element contain in array. ");
        } else {
            System.out.println("No,this element is not contain in array. ");
        }
    }

    private boolean isTrueElement(int element) {
        boolean isTrue = false;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                isTrue = true;
            } else {
                isTrue = false;
            }
        }
        return isTrue;
    }

    public void addAllFromAnotherArray(int[] anotherArray) {
        int[] newArray = new int[array.length + anotherArray.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < anotherArray.length; i++) {
            newArray[i + array.length] = anotherArray[i];
        }
        array = newArray;
    }

    public void equalsArrays(int[] anotherArray) {
        if (isEqualsTrue(anotherArray)) {
            System.out.println("This arrays equal.");
        } else {
            System.out.println("This arrays are not equal. ");
        }
    }

    private boolean isEqualsTrue(int[] anotherArray) {
        if (anotherArray.length != array.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != anotherArray[i]) {
                return false;
            }
        }
        return true;
    }

    public void indexOf(int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                System.out.println("Index of " + element + " is = " + i);
            }
        }
    }

    public void getSize() {
        System.out.println(array.length);
    }

    public void quickSort() {
        int start = 0;
        int end = array.length - 1;
        sorting(start, end);
    }

    private void sorting(int start, int end) {
        if (start >= end) {
            return;
        }
        int i = start;
        int j = end;
        int current = i - (i - j) / 2;
        while (i < j) {
            while (i < current && (array[i] <= array[current])) {
                i++;
            }
            while (j > current && (array[current] <= array[j])) {
                j--;
            }
            if (i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == current)
                    current = j;
                else if (j == current)
                    current = i;
            }
        }
        sorting(start,current);
        sorting(current+1,end);
    }

    public void clear() {
        int[] newArray = new int[0];
        array = newArray;
    }

    //сделать слияние обьектов
    /*public void addAllFromAnotherObject(Container anotherArray){
        int anotherArray.getlength;
        int[]newArray = new int[array.length+anotherArray.length];
        for (int i = 0;i<array.length;i++){
            newArray[i] = array[i];
        }
        for (int i = array.length;i<newArray.length;i++){
            newArray[i] = anotherArray[i];
        }
        array = newArray;
    }*/


    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
