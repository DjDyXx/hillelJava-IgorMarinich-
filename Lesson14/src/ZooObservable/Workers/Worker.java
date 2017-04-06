package ZooObservable.Workers;

import ZooObservable.Animal.Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Worker implements AnimalWorker {
    private String surName;
    private List<Animal> animals;
    private Date date = new Date();


    public Worker(String surName) {
        animals = new ArrayList<Animal>();
        this.surName = surName;
    }

    @Override
    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String getSurName() {
        return surName;
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }

    @Override
    public void notifyObserver(Animal animal) {
        System.out.println(date.toString() + "---ALLARM!!!---"
                            + surName +" you take new message from : "
                            + animal.getName()+ " (ID : " + animal.getId() + ")"
                            + "\n Message : " + animal.getMessage() + "\n");

    }
}
