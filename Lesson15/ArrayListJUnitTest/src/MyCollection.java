public class MyCollection {
    private Object[] array;

    public MyCollection(int size) {
        this.array = new Object[size];
    }

    public int size() {
        return this.array.length;
    }

    public boolean isEmpty() {
        for (Object anArray : this.array) {
            if (anArray != null) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Object object) {
        for (Object anArray : this.array) {
            if (anArray.equals(object)) {
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
            newArray[i+this.array.length] = collection.array[i];
        }
        this.array = newArray;
    }


    public void clear() {
        this.array = new Object[0];
    }

    public void retainAll(MyCollection collection) {
        for (Object anArray : this.array) {
            if (!collection.contains(anArray)) {
                this.remove(anArray);
            }
        }
    }

    public void removeAll(MyCollection collection) {
      for(int i = 0;i<collection.size();i++){
          for (int j = 0;j<this.size();j++){
              if (collection.array[i]==this.array[j]){
                  this.remove(collection.array[i]);
              }
          }
      }
    }

    public boolean containsAll(MyCollection collection) {
        int counter = 0;
        for (int i = 0; i < collection.array.length; i++) {
            for (Object anArray : this.array) {
                if (collection.array[i] == anArray) {
                    counter++;
                }
            }
        }
        return counter == collection.size();
    }

}