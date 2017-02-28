/**
 * Created by DyXx on 25.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        GuideDog sharik = new GuideDog(1,10,35, "Black", "Sharik",true,true);
        Fish fish = new Fish(2,10,1,"red","Fish",false);
        Dog dog = new Dog(2,10,1,"red","Dog",false);
        Hamster hamster = new Hamster(2,10,1,"red","hamster",false,true);
        System.out.println(sharik.voice());
    }
}
