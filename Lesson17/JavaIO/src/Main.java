import Animals.*;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animalsArrayListOutPut = new ArrayList<>();
        ArrayList<Animal>animalsArrayListInPut = new ArrayList<>();

        Animal dog = new Dog(1,10,25,"black","Black",true);
        Animal crocodile = new Crocodile(2,23,100,"green",true);
        Animal cat = new Cat(3,2,5,"white","Moloko",false);
        Animal fish = new Fish(4,5,1,"orange","Valehvost",false);
        Animal guideDogSheriff = new GuideDog(5,10,30,"brown","Sheriff",true,true);
        Animal hamster = new Hamster(6,5,1,"brown","Bibob",true,true);
        Animal guideDogSharik = new GuideDog(7,15,35,"black","Sharik",true,false);

        animalsArrayListOutPut.add(dog);
        animalsArrayListOutPut.add(crocodile);
        animalsArrayListOutPut.add(cat);
        animalsArrayListOutPut.add(fish);
        animalsArrayListOutPut.add(guideDogSheriff);
        animalsArrayListOutPut.add(hamster);
        animalsArrayListOutPut.add(guideDogSharik);

        SaveToFile(animalsArrayListOutPut,"animalsList.dat");
        LoadFromFile(animalsArrayListInPut,animalsArrayListOutPut,"animalsList.dat");
        CheckInfoFromFile(animalsArrayListInPut);

    }

    private static void CheckInfoFromFile(ArrayList<Animal> animalsArrayListInPut) {
        for (Animal el : animalsArrayListInPut){
            System.out.println(el);
        }
    }

    private static Object LoadFromFile(ArrayList<Animal> animalsArrayListInPut, ArrayList<Animal> animalsArrayListOutPut, String s) {
        try (ObjectInputStream outputAnimals = new ObjectInputStream(new FileInputStream("animalsList.dat"))){
            animalsArrayListInPut = (ArrayList<Animal>) outputAnimals.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка ввода / вывода");
            System.exit(2);
        }
        return animalsArrayListInPut;
    }

    private static void SaveToFile(ArrayList<Animal> animalsArrayListOutPut, String s) {
        try (ObjectOutputStream outputAnimals = new ObjectOutputStream(new FileOutputStream("animalsList.dat"))){
            outputAnimals.writeObject(animalsArrayListOutPut);
        } catch (IOException e) {
            System.out.println("Ошибка ввода / вывода");
            System.exit(2);
        }
    }
}
