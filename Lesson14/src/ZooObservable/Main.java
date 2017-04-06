package ZooObservable;

import ZooObservable.Animal.Animal;
import ZooObservable.Animal.Domestic;
import ZooObservable.Animal.Wild;
import ZooObservable.Workers.*;


public class Main {
    public static void main(String[] args) {
        Animal Wolf = new Wild(1 , "Wolfik");
        Animal Cat = new Domestic(2, "Marsik");


        Worker feeder = new Feeder("Fedorenko");
        Worker director = new Director("Ivanovich");
        Worker hairdresser = new Groomer("Selvertorov");
        Worker veterinarian = new Veterinarian("Petrov");

        Cat.subscribe(feeder);
        Cat.subscribe(director);
        Cat.subscribe(hairdresser);
        Cat.subscribe(veterinarian);

        Wolf.subscribe(hairdresser);

        Cat.hungry();
        Cat.getGroom();
        Cat.getIll();

    }
}
