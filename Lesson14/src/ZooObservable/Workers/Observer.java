package ZooObservable.Workers;

import ZooObservable.Animal.Animal;

public interface Observer {
    public void notifyObserver(Animal animal);
}
