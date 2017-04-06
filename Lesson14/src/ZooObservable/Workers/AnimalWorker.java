package ZooObservable.Workers;

import ZooObservable.Animal.Animal;
import ZooObservable.Observer;

import java.util.List;

public interface AnimalWorker extends Observer {
    List<Animal> getAnimals();

    String getSurName();
}
