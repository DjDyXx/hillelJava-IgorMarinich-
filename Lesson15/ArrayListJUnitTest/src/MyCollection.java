public class MyCollection {
    private Object[] array;

    public MyCollection() {
        this.array = new Object[0];
    }

    public int size() {
        return this.array.length;
    }

    public boolean isEmpty() {
        return size()==0;
    }

    public boolean contains(Object object) {
        for (int i = 0;i<this.array.length;i++){
            if (this.array[i]==object){
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
        MyCollection newCollection = new MyCollection();
        for (int i = 0;i<this.array.length;i++){
            if (this.array[i]!= object){
                newCollection.add(this.array[i]);
            }
        }
        this.array = newCollection.array;
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