import Animals.*;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(1,10,25,"black","Black",true);
        Animal crocodile = new Crocodile(2,23,100,"green",true);
        Animal cat = new Cat(3,2,5,"white","Moloko",false);
        Animal fish = new Fish(4,5,1,"orange","Valehvost",false);
        Animal guideDogSheriff = new GuideDog(5,10,30,"brown","Sheriff",true,true);
        Animal hamster = new Hamster(6,5,1,"brown","Bibob",true,true);
        Animal guideDogSharik = new GuideDog(7,15,35,"black","Sharik",true,false);

        ArrayList<Animal> animalsArrayListOutPut = new ArrayList<>();
        animalsArrayListOutPut.add(dog);
        animalsArrayListOutPut.add(crocodile);
        animalsArrayListOutPut.add(cat);
        animalsArrayListOutPut.add(fish);
        animalsArrayListOutPut.add(guideDogSheriff);
        animalsArrayListOutPut.add(hamster);
        animalsArrayListOutPut.add(guideDogSharik);

        SaveToFile(animalsArrayListOutPut,"animalsList.dat");

        ArrayList<Animal>animalsArrayListInPut = LoadFromFile("animalsList.dat");
        CheckInfoFromFile(animalsArrayListInPut);

    }

    private static void CheckInfoFromFile(ArrayList<Animal> animalsArrayListInPut) {
        for (Animal el : animalsArrayListInPut){
            System.out.println(el);
        }
    }

    private static ArrayList<Animal> LoadFromFile(String path) {
        ArrayList<Animal>animalsArrayListInPut = new ArrayList<>();

        try (ObjectInputStream inputAnimals = new ObjectInputStream(new FileInputStream(path))){
            animalsArrayListInPut = (ArrayList<Animal>) inputAnimals.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка ввода / вывода");
            System.exit(2);
        }
        return animalsArrayListInPut;
    }

    private static void SaveToFile(ArrayList<Animal> animalsArrayListOutPut, String path) {
        try (ObjectOutputStream outputAnimals = new ObjectOutputStream(new FileOutputStream(path))){
            outputAnimals.writeObject(animalsArrayListOutPut);
        } catch (IOException e) {
            System.out.println("Ошибка ввода / вывода");
            System.exit(2);
        }
    }
}
