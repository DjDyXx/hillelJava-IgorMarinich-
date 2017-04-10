public class MyCollection {
    private Object[] array;

    public MyCollection(int size) {
        this.array = new Object[size];
    }

    public int size() {
        return this.array.length;
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Object object) {
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public void add(Object object) {
        Object[] newArray = new Object[array.length + 1];
        for (int i = 0; i < this.array.length; i++) {
            newArray[i] = this.array[i];
        }
        newArray[this.array.length] = object;
        this.array = newArray;
    }

    public void remove(Object object) {
        Object[] newArray = new Object[array.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            if (object == this.array[i]) {
                for (; i < newArray.length; i++) {
                    newArray[i] = this.array[i + 1];
                }
            } else {
                newArray[i] = this.array[i];
            }
        }
        this.array = newArray;
    }

    public void addAll(MyCollection collection) {
        Object[] newArray = new Object[this.array.length + collection.array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = this.array[i];
        }
        for (int i = 0; i < collection.array.length; i++) {
            newArray[this.array.length - 1 + i] = collection.array[i];
        }
        this.array = newArray;
    }


    public void clear() {
        this.array = new Object[0];
    }

    public void retainAll(MyCollection collection) {
        for (int i = 0; i < this.array.length; i++) {
            if (!collection.contains(this.array[i])) {
                this.remove(this.array[i]);
            }
        }
    }

    public void removeAll(MyCollection collection) {
        MyCollection removedCollection = new MyCollection(collection.size());
    }

    public boolean containsAll(MyCollection collection) {
        int counter = 0;
        for (int i = 0; i < collection.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (collection.array[i] == this.array[j]) {
                    counter++;
                }
            }
        }
        return counter == collection.size();
    }

}